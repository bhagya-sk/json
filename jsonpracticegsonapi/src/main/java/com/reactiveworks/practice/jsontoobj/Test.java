package com.reactiveworks.practice.jsontoobj;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {
		
		Gson gson=new Gson();
		String jsonString="{ \"employees\":[ {\"firstName\":\"John\", \"lastName\":\"Doe\"}, {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},   {\"firstName\":\"Peter\", \"lastName\":\"Jones\"} ]   }";
		EmployeeDetails employeeDetailsObj = gson.fromJson(jsonString,EmployeeDetails.class );
        System.out.println(employeeDetailsObj);
        
     
        
	}

}
