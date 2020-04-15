package com.reactiveworks.practice;

import com.reactiveworks.practice.model.Student;
import com.reactiveworks.practice.util.JsonUtil;

public class Test {
	
	public static void main(String args[]) {
		
		Student studentObj=new Student();
		studentObj.setFirstName("qwert");
		studentObj.setLastName("asd");
		studentObj.setPercentage(78.8);
		studentObj.setRollNo(1);
		
		//obj to json
		String JsonString = JsonUtil.convertJavaObjectToJson(studentObj);
		System.out.println(JsonString);
		
		//json to obj
		Student student=JsonUtil.convertJsonToJavaObject(JsonString, Student.class);
		System.out.println(student);
	}

}
