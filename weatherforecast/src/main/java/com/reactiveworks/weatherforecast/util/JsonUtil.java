package com.reactiveworks.weatherforecast.util;

import java.io.IOException;
import java.io.InputStream;

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
			jsonResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (JsonMappingException mappingExp) {
			System.out.println("JsonMappingException: unable to convert the Student object into json string");
		} catch (JsonGenerationException jsonGenExp) {
			System.out.println("JsonGenerationException: unable to convert the Student object into json string");
		} catch (IOException ioExp) {
			System.out.println("JsonGenerationException: unable to convert the Student object into json string");
		}

		return jsonResult;
	}

	public static <T> T convertJsonToJavaObject(InputStream jsonStr, Class<T> cls) {
		T result = null;

		try {
			result = objectMapper.readValue(jsonStr, cls);
		} catch (JsonParseException e) {
			System.out.println("unable to convert the json into java object"+e);
		} catch (JsonMappingException e) {
			System.out.println("unable to convert the json into java object"+e);
		} catch (IOException e) {
			System.out.println("unable to convert the json into java object"+e);
		}

		return result;
	}

}