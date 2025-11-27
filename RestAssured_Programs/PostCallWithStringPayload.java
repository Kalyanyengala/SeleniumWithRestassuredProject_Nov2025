package RestAssured_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostCallWithStringPayload 
{
	public void stringPayload()
	{
		//String payload = "{\"name\" : \"kalyan\", \"job\" : \"tester\", \"loacation\" : \"banglore\"}";
		
		String payload = "{\"name\":\"kalyan\" , \"age\" : \"28\" , \"job\" : \"Automation Test Engineer\" }";
		
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
		.body(payload)
		
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
	
	@Test
	public static void payloadWithString()
	{
		String payload = "{\"name\" : \"kalyan\" , \"jobID\" : \"Automation Tester\" , \"company\" : \"Ahana\"}";
		
        RestAssured.baseURI = "Paste URI ";
		
		Response res = RestAssured.given()
		.contentType("application.json")
		.body(payload)
		
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
}
