package com.reactiveworks.practice.objtojsonfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {
	private static final String FILE_NAME="student.json";

	public static void main(String[] args) throws IOException {

		Student studentObj = new Student();
		studentObj.setAge(23);
		studentObj.setName("arun");
		writeJSON(studentObj);
		Student student = readJSON();
		System.out.println(student);
	}

	private static void writeJSON(Student student) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer = new FileWriter(FILE_NAME);
		writer.write(gson.toJson(student));
		writer.close();
	}

	private static Student readJSON() throws FileNotFoundException {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));

		Student student = gson.fromJson(bufferedReader, Student.class);
		return student;
	}

}
