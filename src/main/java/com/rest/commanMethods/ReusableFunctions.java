package com.rest.commanMethods;

import io.restassured.path.json.JsonPath;

public class ReusableFunctions {

		public static JsonPath rowToJson(String getResponce){
			
			JsonPath js = new JsonPath(getResponce);
			
			return js;
			
		}
		
		
		
		
}
