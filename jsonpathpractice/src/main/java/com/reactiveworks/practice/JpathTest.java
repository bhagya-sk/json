package com.reactiveworks.practice;

import java.io.IOException;
import java.io.InputStream;

import com.jayway.jsonpath.JsonPath;


public class JpathTest {

	public static void main(String[] args) throws IOException {

		String jsonString = "{\"store\": { \"books\": [ {\"author\": \"Stephen King\", \"title\": \"IT\"}, {\"author\": \"Agatha Christie\", \"title\": \"The ABC Murders\"} ] } }";
		String jsonExp = "$.store.books[1]";
		InputStream stream = JpathTest.class.getClassLoader().getResourceAsStream("employee.json");
		System.out.println("books: " + JsonPath.read(jsonString, jsonExp));
		System.out.println("id: " + JsonPath.read(stream, "$.id"));
		System.out.println("phoneNumbers: " + JsonPath
				.read(JpathTest.class.getClassLoader().getResourceAsStream("employee.json"), "$.phoneNumbers"));

		System.out.println("last phoneNumber: " + JsonPath
				.read(JpathTest.class.getClassLoader().getResourceAsStream("employee.json"), "$.phoneNumbers[-1]"));
	
	    org.json.JSONObject obj = new org.json.JSONObject(jsonString);
	    System.out.println(" :"+obj.query("/store/books"));

		
	}
}