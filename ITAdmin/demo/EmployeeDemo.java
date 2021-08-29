package com.gl.ITAdmin.demo;

import java.util.Scanner;

import com.gl.ITAdmin.beans.Employee;
import com.gl.ITAdmin.services.CredentialServiceImpl;
import com.gl.ITAdmin.services.ICredentialService;

public class EmployeeDemo {

	public static void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+ employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email -->"+employee.getEmailid());
		System.out.println("Password -->"+employee.getPassword());
	}
	public static void proceed(String firstName, String lastName, String department, ICredentialService service) {
		Employee employee = new Employee(firstName, lastName, department);
		employee.setEmailid(service.generateEmailAddress(employee));
		employee.setPassword(service.generatePassword());
		showCredentials(employee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String department="";
		Scanner scr = new Scanner(System.in);
		ICredentialService service = (ICredentialService) new CredentialServiceImpl();
		while(true) {
			System.out.println("Enter your first name: ");
			String firstName = scr.next();
			System.out.println("Enter your last name: ");
			String lastName = scr.next();
			while(true) {
				System.out.println("Please enter the department from the following");
				System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal \n5. End Selection");
				int option = scr.nextInt();
				switch(option) {
				case 1:
					department = "Technical";
					proceed(firstName, lastName, department, service);
					break;
				case 2:
					department = "Admin";
					proceed(firstName, lastName, department, service);
					break;
				case 3:
					department = "HumanResource";
					proceed(firstName, lastName, department, service);
					break;
				case 4:
					department = "Legal";
					proceed(firstName, lastName, department, service);
					break;
				case 5:
					scr.close();
					System.exit(1);
				default:
					System.out.println("Please enter correct option");
				}
				if ((option == 1) || (option == 2) || (option == 3) || (option == 4)){
					System.out.println("Press 1 to continue else exit");
					int flag = scr.nextInt();
					if (flag == 1){
						break;
					}
					else {
						scr.close();
						System.exit(1);
					}
				}
			}
		}
	}
}
