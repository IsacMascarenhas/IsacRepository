package com.desafio.desafio.util;

import java.time.LocalDateTime;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTransformer {
	private static Gson transformer = new GsonBuilder()
			.excludeFieldsWithoutExposeAnnotation()
			.disableHtmlEscaping()
			.registerTypeAdapter(LocalDateTime.class, new GsonLocalDateSerializer())
			.registerTypeAdapter(LocalDateTime.class, new GsonLocalDateDeserializer())
			.setPrettyPrinting()
			.create();

	public static String toJson(Object object) {

		return transformer.toJson(object);

	}

	public static <T> T toObject(String json, Class<T> clazz) {

		return transformer.fromJson(json, clazz);

	}

	static <T> void fromArrayJSON(String arrayJson, Class<T> clazz) {
		try {
			JSONArray array = new JSONArray(arrayJson);
			for(int i = 0; i<array.length();i++){
				
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
