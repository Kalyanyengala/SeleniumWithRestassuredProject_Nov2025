package RestAssured_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PostCallWithMapPayload 
{
	
	public void mapPayload()
	{
		Map<String , String> mapPayload = new HashMap<>();
		mapPayload.put("name", "kalyan");
		mapPayload.put("job", "automation tester");
		mapPayload.put("loaction", "Bengaluru");
		
		Map<String , String> map = new HashMap<>();
		map.put("contentType", "application/json");
		map.put("authorization", " token paste");
		map.put("accept","application/json");
		map.put("cache-control", "no-cache");
		map.put("cookies", "users=2; values = 1");
		
        RestAssured.baseURI = "Paste URI ";
		
		Response res = RestAssured.given()
		.contentType("application.json")
		.headers(map)
		.body(mapPayload.toString())
		
		.when()
		.post("https://google.com")
		
		.then()
		.extract()
		.response();		
		
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getContentType());
		System.out.println(res.getCookie("cookies"));
		System.out.println(res.getHeader("accept"));
		System.out.println(res.getHeaders());
		System.out.println(res.getBody().asString());
		
	}
	
	public static void payloadWithMap()
	{
		Map<String , String> mapPayload = new HashMap<>();
		
		mapPayload.put("name", "kalyan");
		mapPayload.put("job", "Automation Tester");
		mapPayload.put("company", "Private Systems");
		mapPayload.put("jobID", "9857");
		mapPayload.put("location", "Bengaluru");
		
		
		
		Map<String , String> mapHeaders = new HashMap<>();
		
		mapHeaders.put("content-Type", "application/json");
		mapHeaders.put("Authorization", "beareerToken");
		
		RestAssured.baseURI = "https://google.com";
		
		Response response = RestAssured.given()
		
		.body(mapPayload.toString())
		.headers(mapHeaders)
		
		.when()
		
		.post("/users")
		
		.then()
		
		.extract()
		.response();
		
		System.out.println("Printing Response :" + response.asString());
		String header = response.getHeader("content-Type");
		long responseTime = response.time();
		String name = response.jsonPath().getString("name");
		String job = response.jsonPath().getString("job");
		int ID = response.jsonPath().getInt("jobID");
		
		
		Assert.assertTrue("Invalid Header", header.contains("application/json"));
		Assert.assertTrue("Invalid ResponseTime", responseTime<2000);
		Assert.assertEquals(name, "kalyan", "invalid Name");
		Assert.assertEquals("Job Invalid", job, "Automation Tester");
		Assert.assertEquals("JobID invalid", ID, 9857);	
	}
	
	@Test
	public static void payloadWithHelpOfMap()
	{
		Map<String,String> mapPayload = new HashMap<>();
		
		mapPayload.put("name", "Kalyan");
		mapPayload.put("jobID", "9857");
		mapPayload.put("jobRole", "Automation Test Engineer");
		mapPayload.put("mobileNO", "7337279857");
		
        RestAssured.baseURI = "https://google.com";
		
		Response response = RestAssured.given()
		
		.body(mapPayload.toString())
		.contentType("application.json")
		
		.when()
		
		.post("/users")
		
		.then()
		
		.extract()
		.response();
		
		System.out.println("Printing Response :" + response.asString());
		String header = response.getHeader("content-Type");
		long responseTime = response.time();
		String name = response.jsonPath().getString("name");
		String job = response.jsonPath().getString("job");
		int ID = response.jsonPath().getInt("jobID");
		
		
		Assert.assertTrue("Invalid Header", header.contains("application/json"));
		Assert.assertTrue("Invalid ResponseTime", responseTime<2000);
		Assert.assertEquals(name, "kalyan", "invalid Name");
		Assert.assertEquals("Job Invalid", job, "Automation Tester");
		Assert.assertEquals("JobID invalid", ID, 9857);			
		
	}	
}
