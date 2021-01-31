
package crudData;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import resources.EmployeePayload;
import resources.ReusablesData;



public class CreateAPI extends ReusablesData{
	
	// The below method is used to create new employee record

	public void POSTRequest() {
		RestAssured.baseURI = url();
		String response = given().header("Content-Type","application/json")
		.body(EmployeePayload.AddEmp())
		.when().post(postresource())
		.then().assertThat().statusCode(200).body("status", equalTo("success")).extract().response().asString();
		System.out.println(response);
		
		//JsonPath js = new JsonPath(response); //parsing the response
		String result = conv2Json(response).get("message");
		System.out.println("POST request output: " +result);
		if(result.equalsIgnoreCase("Successfully! Record has been added."))
			System.out.println("POST API working as expected");
		else
			System.out.println("Not able to add a new Employee record to Post api");

	}
}
