package com.rest.commanMethods;

public class PayLoad {

	
	public static String AddPlace(){
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Rahul Shetty Academy\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
		
	}
	
	
	public static String courceContent() {
		
		return "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"{\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\"price\": 50,\r\n" + 
				"\"copies\": 6\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\"price\": 40,\r\n" + 
				"\"copies\": 4\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\"price\": 45,\r\n" + 
				"\"copies\": 10\r\n" + 
				"}\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
	}
	
	
	
	public static String Addbook(String isbn, String aisle) {
	
		String payload = "{\r\n" + 
				"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\"author\":\"John foe\"\r\n" + 
				"}";
		
		return payload;
		
	}
	
	public static String newPayload() {
		
		String str ="{\r\n"
				+ "  \"array\": [\r\n"
				+ "    1,\r\n"
				+ "    2,\r\n"
				+ "    3\r\n"
				+ "  ],\r\n"
				+ "  \"boolean\": true,\r\n"
				+ "  \"color\": \"gold\",\r\n"
				+ "  \"null\": null,\r\n"
				+ "  \"number\": 123,\r\n"
				+ "  \"object\": {\r\n"
				+ "    \"a\": \"b\",\r\n"
				+ "    \"c\": \"d\"\r\n"
				+ "  },\r\n"
				+ "  \"string\": \"Hello World\"\r\n"
				+ "}";
		return str;
	}
}
