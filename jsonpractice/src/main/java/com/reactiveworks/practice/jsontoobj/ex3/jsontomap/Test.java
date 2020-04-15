package com.reactiveworks.practice.jsontoobj.ex3.jsontomap;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Test {

	// creating map from json file
	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = Test.class.getClassLoader().getResource("data.txt");
		// byte[] jsonData = Files.readAllBytes(Paths.get(uri));
		ObjectMapper objMapper = new ObjectMapper();
		// HashMap<String, String> map = objMapper.readValue(resource, HashMap.class);
		HashMap<String, String> map = objMapper.readValue(resource, new TypeReference<HashMap<String, String>>() {
		});
		System.out.println(map);
	}

}
