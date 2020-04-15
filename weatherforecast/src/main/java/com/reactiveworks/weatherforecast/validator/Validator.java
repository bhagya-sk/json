package com.reactiveworks.weatherforecast.validator;

import org.apache.log4j.Logger;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Validator {

	private static final String SCHEMA_FILE = "schema.json";
	private static final String DATA_FILE = "WeatherForecast.json";
	private static final Logger LOGGER_OBJ = Logger.getLogger(Validator.class);

	@SuppressWarnings("unused")
	public static void isValidJson() {

		try {
			JSONObject jsonSchema = new JSONObject(
					new JSONTokener(Validator.class.getClassLoader().getResourceAsStream(SCHEMA_FILE)));

			JSONObject jsonSubject = new JSONObject(
					new JSONTokener(Validator.class.getClassLoader().getResourceAsStream(DATA_FILE)));

			Schema schema = SchemaLoader.load(jsonSchema);
			schema.validate(jsonSubject);
			LOGGER_OBJ.debug("json data is valid");
		} catch (ValidationException validationExp) {
			LOGGER_OBJ.debug("json data is invalid", validationExp);

		} catch (JSONException jsonException) {
			LOGGER_OBJ.debug("json data is invalid", jsonException);

		}

	}
}
