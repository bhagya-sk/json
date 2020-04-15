package com.reactiveworks.practice.jsontoobj.ex1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String args[]) {

		String jsonStr = "{  \"name\" : \"Mahesh\", \"age\" : 21 }";
		String jsonStr1 = "{\"id\":123,\"name\":\"Pankaj Kumar\",\"permanent\":true,\"address\":{\"street\":\"El Camino Real\",\"city\":\"San Jose\",\"zipcode\":95014},\"phoneNumbers\":[9988664422, 1234567890],\"role\":\"Developer\"}";
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		Employee empObj = gson.fromJson(jsonStr, Employee.class);
		System.out.println(empObj);

		// object to json
		Gson gson1 = new Gson();
		String jsonString = gson1.toJson(empObj);
		//System.out.println("without pretty fit "+jsonString);
		
		// formatting output
		jsonString = gson.toJson(empObj);
		//System.out.println("after setting pretty fit"+jsonString);
		
		
		empObj =  gson.fromJson(jsonStr1,Employee.class);
		jsonString = gson.toJson(empObj);
		System.out.println("after setting pretty fit"+jsonString);
	}

}
