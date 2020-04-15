package com.reactiveworks.weatherforecast;

import java.io.InputStream;

import com.reactiveworks.weatherforecast.model.WeatherForecast;
import com.reactiveworks.weatherforecast.util.JsonUtil;
import com.reactiveworks.weatherforecast.validator.Validator;

public class Test {

	public static void main(String[] args) {

		InputStream jsonStream = Test.class.getClassLoader().getResourceAsStream("WeatherForeCast.json");
		WeatherForecast weatherForeCast = JsonUtil.convertJsonToJavaObject(jsonStream, WeatherForecast.class);
		//System.out.println(weatherForeCast);
		System.out.println(JsonUtil.convertJavaObjectToJson(weatherForeCast));
		Validator.isValidJson();
	}

}
