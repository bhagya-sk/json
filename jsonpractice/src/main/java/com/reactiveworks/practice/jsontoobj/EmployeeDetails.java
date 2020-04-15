package com.reactiveworks.practice.jsontoobj;

import java.util.List;

public class EmployeeDetails {

	List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employees=" + employees + "]";
	}

}
