package com.reactiveworks.practice.objtojson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.reactiveworks.practice.objtojson.*")
public class EmpConfiguration {

	@Bean("emp1")
	public Employee empBean() {
		Employee empObj = new Employee();
		empObj.setEmpName("a");
		empObj.setEmpNo(1);
		empObj.setSalary(10000);
		empObj.setAddress(addressBean1());
		return empObj;
	}

	@Bean("emp2")
	public Employee empBean2() {
		Employee empObj = new Employee();
		empObj.setEmpName("b");
		empObj.setEmpNo(2);
		empObj.setSalary(20000);
		empObj.setAddress(addressBean2());
		return empObj;
	}

	@Bean("addr1")
	public Address addressBean1() {
		Address address = new Address();
		address.setCity("kalaburagi");
		address.setPincode(585102);
		address.setState("karnataka");

		return address;
	}
	
	@Bean("addr2")
	public Address addressBean2() {
		Address address = new Address();
		address.setCity("bidar");
		address.setPincode(585102);
		address.setState("karnataka");

		return address;
	}


}
