package com.rest.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rest.commanMethods.*;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParseWithTestng2 {

/*
 * {
  "array": [
    1,
    2,
    3
  ],
  "boolean": true,
  "color": "gold",
  "null": null,
  "number": 123,
  "object": {
    "a": "b",
    "c": "d"
  },
  "string": "Hello World"
}
 */
	
	@Test
	public void practice() {
		
		JsonPath js = new JsonPath(PayLoad.newPayload());
		int size = js.getInt("array.size()");
		System.out.println(size);
		Boolean status = js.getBoolean("boolean");
		System.out.println(status);
		
		System.out.println(js.get("null"));
		System.out.println(js.get("number"));
		System.out.println(js.get("string"));
		
for(int i=0;i<size;i++) {
	int sizee = js.getInt("array["+i+"]");
	System.out.println(sizee);
}
		


		
		
		
		
		
		
		//Assert.assertEquals(totalPurchaseAmount, sum);

	}
}