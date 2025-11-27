package RestAssured_Programs;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PathParams_Programs 
{
	public void pathParamProgram()
	{
        String payload = "{\"name\" : \"kalyan\", \"job\" : \"tester\", \"loacation\" : \"banglore\"}";
		
		Map<String , String> map = new HashMap<>();
		map.put("contentType", "application/json");
		map.put("authorization", " token paste");
		map.put("accept","application/json");
		map.put("cache-control", "no-cache");
		map.put("cookies", "users=2; values = 1");
		
		Map<String , Integer> mapPathParam = new HashMap<>();
		mapPathParam.put("id", 2);
		mapPathParam.put("number", 10);
		mapPathParam.put("value", 8);		
		
		
        RestAssured.baseURI = "Paste URI ";
		
		Response res = RestAssured.given()
		.contentType("application.json")
		.headers(map)
		.body(payload.toString())
//		.pathParam("id", 2)         // default way if we have 2 add it same as below
//		.pathParam("user", 5)
		.pathParams(mapPathParam)     // like this we can add if we have multiple path querys		
				
		.when()
		//.post("https://google.com/{id}") 
		.post("https://google.com/{id}/posts{users}")
		
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
