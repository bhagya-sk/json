package com.reactiveworks.practice.jsontoobj.ex2file;

import java.util.Arrays;
import java.util.Map;

import com.reactiveworks.practice.jsontoobj.ex1.Address;

public class Employee {

	private int id;
	private String name;
	private boolean permanent;
	private Address address;
	private Long[] phoneNumbers;
	private String role;
	private String[] cities;
	private Map<String, String> properties;

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

	public String[] getCities() {
		return cities;
	}

	public void setCities(String[] cities) {
		this.cities = cities;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", address=" + address
				+ ", phoneNumbers=" + Arrays.toString(phoneNumbers) + ", role=" + role + ", cities="
				+ Arrays.toString(cities) + ", properties=" + properties + "]";
	}

}
