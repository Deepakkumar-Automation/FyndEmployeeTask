package resources;



public class EmployeePayload {
	
	public static String AddEmp() {
		
		String postbody = "{\r\n" + 
				"  \"name\": \"Deepak Telagar\",\r\n" + 
				"  \"salary\": \"65000\",\r\n" + 
				"  \"age\": \"26\"\r\n" + 
				"}";
		return postbody;
	
	}
	
	public static String modifyEmp() {
		String putbody = "";
		return putbody;
	}

}
