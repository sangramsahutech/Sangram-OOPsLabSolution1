package com.gl.ITAdmin.services;

import com.gl.ITAdmin.beans.Employee;

public interface ICredentialService {
	public String generateEmailAddress(Employee employee);
	public String generatePassword();
}
