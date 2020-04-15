package com.reactiveworks.practice.objtojson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reactiveworks.practice.util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfiguration.class);
		Employee empObj = context.getBean("emp1", Employee.class);
		Employee empObj1 = context.getBean("emp2", Employee.class);
		String jsonString = JsonUtil.convertJavaObjectToJson(empObj);
		System.out.println("empObj to jsonString: " + jsonString);

		Map<Integer, Employee> empMap = new LinkedHashMap<>();
		empMap.put(1, empObj);
		empMap.put(2, empObj1);
		String jsonString1 = JsonUtil.convertJavaObjectToJson(empMap);
		System.out.println("map to jsonString: " + jsonString1);

		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(empObj1);
		employeesList.add(empObj);
		String jsonString2 = JsonUtil.convertJavaObjectToJson(employeesList);
		System.out.println("list to jsonString: " + jsonString2);

		((AnnotationConfigApplicationContext) (context)).close();
	}

}
