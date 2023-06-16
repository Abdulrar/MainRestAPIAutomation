package prcatice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;  
import static org.hamcrest.Matchers.*;

import org.testng.Assert;


public class BasicsCreate {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		String response = given().log().all().header("Content-Type","application/json").queryParam("key", "qaclick123")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house1\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "")
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(response);
		
		JsonPath path = new JsonPath(response);
		System.out.println(path.getString("place_id"));
		String placeId = path.getString("place_id");
		
		
		System.out.println("-------------------------------------------------------------------------------");
		String address = "70 Summer walk,,,,,,,,,,,,,,,";
		
		String updateResponse = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+address+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+updateResponse);
		
		
		String getResponce = given().log().all().queryParam("place_id", placeId).queryParam("key", "qaclick123")
				.when().get("/maps/api/place/get/json")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
				
				System.out.println(getResponce);
		
				JsonPath getpath = new JsonPath(getResponce);
				System.out.println(getpath.getString("address"));
				String expectedAddress = getpath.getString("address");
				
				Assert.assertEquals(address, expectedAddress);
				
				
	}

}
