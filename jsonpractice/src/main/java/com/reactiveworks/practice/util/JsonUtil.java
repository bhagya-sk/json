package com.reactiveworks.practice.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper objectMapper;

	static {
		objectMapper = new ObjectMapper();
	}

	public static String convertJavaObjectToJson(Object obj) {

		String jsonResult = null;
		try {
			jsonResult = objectMapper.writeValueAsString(obj);
		} catch (JsonMappingException mappingExp) {
			System.out.println("JsonMappingException: unable to convert the Student object into json string");
		} catch (JsonGenerationException jsonGenExp) {
			System.out.println("JsonGenerationException: unable to convert the Student object into json string");
		} catch (IOException ioExp) {
			System.out.println("JsonGenerationException: unable to convert the Student object into json string");
		}

		return jsonResult;
	}

	public static <T> T convertJsonToJavaObject(String jsonStr, Class<T> cls) {
		T result = null;

		try {
			result = objectMapper.readValue(jsonStr, cls);
		} catch (JsonParseException e) {
			System.out.println("JsonParseException: unable to convert the json into java object");
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException: unable to convert the json into java object");
		} catch (IOException e) {
			System.out.println("IOException: unable to convert the json into java object");
		}

		return result;
	}

}