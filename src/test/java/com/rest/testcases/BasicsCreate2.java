package com.rest.testcases;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;  
import static org.hamcrest.Matchers.*;
import com.rest.commanMethods.*;


public class BasicsCreate2 {

	public static void main(String[] args) {

		//Rest Assured works on three principles 1)Given 2)When and 3)Then   
		///given - all input details 
		//when - Submit the API - resource,http method
		//Then - validate the response
		
		
		//Add place-> Update Place with New Address -> Get Place to validate if New address is present in response
		
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		//Because there are some packages they are static in nature --- like given() we have to import manually package
		//equalTo method is coming from "hamcrest.Matchers" java package is it also static 
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(PayLoad.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");
		
		
		
	}

}
