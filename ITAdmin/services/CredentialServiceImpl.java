package com.gl.ITAdmin.services;

import com.gl.ITAdmin.beans.Employee;

public class CredentialServiceImpl implements ICredentialService {

	@Override
	public String generateEmailAddress(Employee employee) {
		// TODO Auto-generated method stub
		return employee.getFirstName()+employee.getLastName()+"."+employee.getDepartment()+"@abc.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String password="";
		for(int i=0;i<5;i++) {
			password=password+ranChar("abcdefghijklmnopqrstuvwxyz");
		}
		String ranDigit = ranChar("0123456789");
		password = insRan(password, ranDigit);
		String ranCap = ranChar("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		password = insRan(password, ranCap);
		String randomSymbol = ranChar("!@#$%^&*_+?");
        password = insRan(password, randomSymbol);
		return password;
	}
	public static String ranChar(String text) {
		int a = text.length();
		int b = (int) (a*Math.random());
		return text.substring(b, b+1);
	}
	public static String insRan(String text1, String insText) {
		int a = text1.length();
		int b = (int)((a+1)* Math.random());
		return text1.substring(0, b)+insText+text1.substring(b);	
	}
	
}
