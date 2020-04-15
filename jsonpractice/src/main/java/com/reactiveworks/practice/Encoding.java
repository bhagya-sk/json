package com.reactiveworks.practice;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Encoding {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("name", "name");
		obj.put("age", 42);
		System.out.println(obj);

		Map<String, Object> map = new HashMap<>();
		map.put("name", "name");
		map.put("age", 42);
		String jsonString = JSONValue.toJSONString(map);
        System.out.println(jsonString);
        
        
	}

}
