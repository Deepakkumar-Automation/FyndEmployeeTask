package crudData;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import resources.ReusablesData;

public class DeleteAPI extends ReusablesData{
	public void DELETERequest() {
		RestAssured.baseURI = url();
		String response = given().header("Content-Type","application/json").header("id",getempid())
				.when().delete(getresource())
				.then().log().all().assertThat().statusCode(200).body("status", equalTo("success")).extract().response().asString();
		
		System.out.println(response);
		String result = conv2Json(response).get("message");
		System.out.println("DELETE request output: " +result);
		if(result.equalsIgnoreCase("Successfully! Record has been deleted"))
			System.out.println("DELETE API working as expected");
		else
			System.out.println("Not able to delete an existing Employee record to Post api");

	}

}
