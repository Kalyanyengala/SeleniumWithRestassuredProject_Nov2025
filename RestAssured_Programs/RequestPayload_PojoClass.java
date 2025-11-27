package RestAssured_Programs;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class RequestPayload_PojoClass 
{
	private String name;
	private String role;
	private int age;
	
	
	public RequestPayload_PojoClass(String name , String role, int age)
	{
		this.name = name;
		this.role = role;
		this.age = age;
	}	
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getRole() 
	{
		return role;
	}
	
	public void setRole(String role) 
	{
		this.role = role;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	

	public static void requestPayload()
	{
		RestAssured.baseURI = "https://www.naukri.com";
		
		RequestPayload_PojoClass pojoPayload = new RequestPayload_PojoClass("Kalyan" , "Automation Tester" , 27);
		
	    Response response = 
				
			RestAssured.	
			
			given()
			
			.contentType("application/json")
			.queryParam("/Users", 2)
			.body(pojoPayload)
			
			.when()
			
			.post("/mnjuser/profile")
			
			.then()
			
			.extract().response();
	    
	    System.out.println("Printing response :" + response.asString());
	    System.out.println("Printing statusCode :" + response.getStatusCode());
	    
	    long responseTime = response.getTime();
	    String header = response.getHeader("content-Type");
	    String name = response.jsonPath().getString("name");
	    String role = response.jsonPath().getString("role");
	    int age = response.jsonPath().getInt("age");
	    
	   Assert.assertEquals(response.getStatusCode(), 201, "Statuscode Invalid");
	   Assert.assertTrue( responseTime < 2000 , "Responsetime is too lone");
	   Assert.assertTrue(header.contains("application/json"), "Invalid Header");
	   Assert.assertEquals(name, "Kalyan", "InvalidName");
	   Assert.assertEquals(role, "Automation Tester", "Role Mismatched");
	   Assert.assertEquals(age, 27, "Age mismatched");	
		
	}

}
