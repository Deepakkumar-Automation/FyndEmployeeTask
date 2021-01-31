package resources;

import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
//import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class ReusablesData {
	
	/*
	 * RequestSpecification req; public RequestSpecification requestSpecification()
	 * {
	 * 
	 * PrintStream log = new PrintStream(new FileOutputStream("Report.txt")); req =
	 * RequestSpecBuilder.setBaseUri(url()).addFilter(RequestLoggingFilter.
	 * logRequestTo(log)) .addFilter(ResponseLoggingFilter.logResponseTo(log))
	 * .setContentType(ContentType.JSON).build(); return req;
	 * 
	 * }
	 */
	

	public static String url() {
		String endpoint = "http://dummy.restapiexample.com";
		return endpoint;
	}
	
	public static String postresource() {
		String resource = "api/v1/create";
		return resource;
	}
	
	public static String putresource() {
		String putresource = "api/v1/update";
		return putresource;
	}
	
	public static String getresource() {
		String resource = "api/v1/employee";
		return resource;
	}
	
	public static String deleteresource() {
		String resource ="api/v1/delete";
		return resource;
	}
	
	public static int getempid(){
		int empid = 1;
		return empid;
	}
	
public static JsonPath conv2Json(String response) {
		
		JsonPath jsp = new JsonPath(response);
		return jsp; 
	}

}
