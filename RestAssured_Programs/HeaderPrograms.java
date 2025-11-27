package RestAssured_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeaderPrograms 
{
	public void headerPrograms()
	{
		// Approach 1
		
		Header header = new Header("content-type" , "application/json");
		
		// Approach 2 if we have multiple headers 
		
		Header h1 = new Header("authorization" , "token");
		Header h2 = new Header("accept" , "application/json");
		Header h3 = new Header("cache-control" , "no-cache");
		Header h4 = new Header("cookies" , "user=1;profile=2");
		
		Headers headers = new Headers(h1,h2,h3,h4);
		
		// Approach3
		
		Map<String , String> headersMap = new HashMap<>();
		
		headersMap.put("authorization" , "token");
		headersMap.put("accept" , "application/json");
		headersMap.put("cache-control" , "no-cache");
		headersMap.put("cookies" , "user=1;profile=2");		
		
		String payload = "{\"name\" : \"kalyan\", \"job\" : \"tester\", \"loacation\" : \"banglore\"}";
		
        RestAssured.baseURI = "Paste URI ";
		
		Response res = RestAssured.given()
		.contentType("application.json")
	//	.header("content-type")    -------> for single header 
	//	.header(header)             --------> first Approach
	//	.headers(headers)            ---------> second Approach
		.headers(headersMap)        // --------> third Approach 
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
	
	void headerTestProgram()
	{
		// Approach 1
		
		Header head = new Header("content-Type" , "application/json");
		
		// Approach 2
		
		Header h1 = new Header("authorization" , "paste token");
		Header h2 = new Header("accept" , "application/json");
		Header h3 = new Header("cache-control" , "no-cache");
		Header h4 = new Header("cookies" , "id=2;user=3");
		
		Headers head1 = new Headers(h1, h2, h3, h4);
		
		// Approach 3
		
		Map<String , String> map = new HashMap<>();
		
		map.put("authorization" , "token");
		map.put("accept" , "application/json");
		map.put("cache-control" , "no-cache");
		map.put("cookies" , "user=1;profile=2");
		map.put("content-Type", "application/json");		
		
        RestAssured.baseURI = "Paste URI ";
        
        String payload = "{\"name\" : \"kalyan\", \"job\" : \"tester\", \"loacation\" : \"banglore\"}";
		
		Response res = RestAssured.given()
		.contentType("application.json")
		.header(head)
		.headers(head1)
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
}
