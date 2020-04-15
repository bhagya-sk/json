package com.reactiveworks.practice.jsontoobj.ex1;

import java.util.Arrays;

public class Employee {

	private int id;
	private String name;
	private boolean permanent;
	private Address address;
	private Long[] phoneNumbers;
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", address=" + address
				+ ", phoneNumbers=" + Arrays.toString(phoneNumbers)+ ", role=" + role + "]";
	}

}
