package com.reactiveworks.practice.objtojson;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@JsonIgnore
	private String empName;
	private int empNo;
	private int salary;
	private Address address;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", salary=" + salary + ", address=" + address
				+ "]";
	}

}
