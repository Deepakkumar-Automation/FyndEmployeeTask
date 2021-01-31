package crudData;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import resources.ReusablesData;

public class ReadAPI extends ReusablesData{
	
	public void getrequest() {
		//String empid = ;
		RestAssured.baseURI = url();
		String response = given().header("Content-Type","application/json").header("id",getempid())
						  .when().get("api/v1/employee")
						  .then().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		String result = conv2Json(response).get("message");
		System.out.println("GET request output: " +result);
		if(result.equalsIgnoreCase("Successfully! Record has been fetched."))
			System.out.println("GET API working as expected");
		else
			System.out.println("Not able to view the employee record using GET request");

	}
	

}
