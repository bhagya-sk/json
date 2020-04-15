package com.reactiveworks.practice.jsontoobj.ex2file;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.map.ObjectMapper;

import com.reactiveworks.practice.util.JsonUtil;

public class Test {

	public static void main(String[] args) throws IOException, URISyntaxException {
		URI uri = Test.class.getClassLoader().getResource("employee.txt").toURI();
		byte[] jsonData = Files.readAllBytes(Paths.get(uri));
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// convert json string to object
		Employee emp = objectMapper.readValue(jsonData, Employee.class);

		System.out.println("Employee Object\n" + emp);
		
		String jsonString = JsonUtil.convertJavaObjectToJson(emp);
		System.out.println("object to json String: "+jsonString);
		
	}

}