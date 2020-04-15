package com.reactiveworks.practice.jsontoobj.ex1;

import com.reactiveworks.practice.util.JsonUtil;

public class Test {

	public static void main(String[] args) {

		String jsonStr = "{\"id\":123,\"name\":\"Pankaj Kumar\",\"permanent\":true,\"address\":{\"street\":\"El Camino Real\",\"city\":\"San Jose\",\"zipcode\":95014},\"phoneNumbers\":[9988664422, 1234567890],\"role\":\"Developer\"}";

		Employee emp = JsonUtil.convertJsonToJavaObject(jsonStr, Employee.class);
		System.out.println(emp);
	}

}
