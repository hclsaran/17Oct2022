package com.saran.model;

import lombok.Data;

//Model -> has POJO and business logic

@Data
public class Employee {
	
	private int empId;
	private String empName;
	private String password;
	
	public boolean validate() {
		if(empName.equals("Jalen")&& password.equals("123")) {
			return true;
		}
		else {
			return false;
		}
	}

}
