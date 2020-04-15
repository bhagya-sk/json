package com.reactiveworks.practice.ex3.readingspecifickey;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) throws URISyntaxException, IOException {
//URI uri = Test.class.getClassLoader().getResource("employee.txt").toURI();
		URI uri = Test.class.getClassLoader().getResource("employee.json").toURI();
		byte[] jsonData = Files.readAllBytes(Paths.get(uri));
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode rootNode = objMapper.readTree(jsonData);
		JsonNode node = rootNode.path("name");
		
		System.out.println(node.asText());

	}

}
