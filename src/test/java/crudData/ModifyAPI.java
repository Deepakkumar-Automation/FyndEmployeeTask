package crudData;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import resources.EmployeePayload;
import resources.ReusablesData;

public class ModifyAPI extends ReusablesData {
	
	public void putrequest() {
		RestAssured.baseURI = url();
		String response = given().header("Content-Type","application/json").header("id","1")
						  .body(EmployeePayload.modifyEmp())
						  .when().put(putresource())
						  .then().assertThat().statusCode(200).body("status", equalTo("success")).extract().response().asString();
		String result = conv2Json(response).get("message");
		System.out.println("PUT request output: " +result);
		if(result.equalsIgnoreCase("Successfully! Record has been added."))
			System.out.println("PUT API working as expected");
		else
			System.out.println("Not able to update the Employee Record");
		
	}

}
