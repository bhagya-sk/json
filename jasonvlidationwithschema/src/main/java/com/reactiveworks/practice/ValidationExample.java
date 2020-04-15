package com.reactiveworks.practice;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ValidationExample {

	public static void main(String[] args) {
		try {
			//System.out.println(ValidationExample.class.getClassLoader().getResourceAsStream("schema.json"));
		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(ValidationExample.class.getClassLoader().getResourceAsStream("schema.json")));

		JSONObject jsonSubject = new JSONObject(
				new JSONTokener(ValidationExample.class.getClassLoader().getResourceAsStream("data.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		schema.validate(jsonSubject);
		System.out.println("json data is valid");
		}catch(ValidationException validationExp) {
			System.out.println("json data is invalid"+validationExp);
		} 
		
	}

}
