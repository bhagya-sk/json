package com.reactiveworks.practice.jsontoobj;

import com.reactiveworks.practice.util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		String jsonString = "{ \"employees\":[ {\"firstName\":\"John\", \"lastName\":\"Doe\"}, {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},   {\"firstName\":\"Peter\", \"lastName\":\"Jones\"} ]   }";

		EmployeeDetails employees = JsonUtil.convertJsonToJavaObject(jsonString, EmployeeDetails.class);
		System.out.println(employees);

	}

}
