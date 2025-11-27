package RestAssured_Programs;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.Assert;


public class PostCallWithJSONPayload 
{
	public static void jsonPayload()
	{
		JSONObject jsonPayload = new JSONObject();
		
		jsonPayload.put("name", "Kalyan");
		jsonPayload.put("job", "Automation Test Engineer");
		jsonPayload.put("phoneNumber", 7337279857l);
		jsonPayload.put("id", 9857);
		
		RestAssured.baseURI = "https://testautomationpractice.blogspot.com/"; // ----> this is one way 
		
		String base_Uri = "https://testautomationpractice.blogspot.com/";    // ----> second way
		
		Header header = new Header("contentType" , "application/json");
		Header header1 = new Header("authorixation" , "token paste");
		Header header2 = new Header("accept" , "application/json");
		Header header3 = new Header("cache-control" , "no-cache");
		Header header4 = new Header("cookie" , "requires = 2 ; user = 1");
		
		Headers headers = new Headers(header,header1,header2,header3,header4);
		
		String pathParam = "/user";
	
		Response response = RestAssured
		
		.given()
		     .contentType("application.json")
		     .headers(headers)
		     .pathParam("/users", pathParam)
		     .body(jsonPayload.toString())		
		.when()
		     // .post(base_Uri + pathParam)
		      .post("https://testautomationpractice.blogspot.com")
		
		.then()
		      .extract()
		      .response();
		
		System.out.println("Printing Response :" + response.asString());
		System.out.println("Printing StatusCode : " + response.getStatusCode());
		
	    int statuscode = response.getStatusCode();
	    Assert.assertEquals(statuscode, 201 , "Invalid StatusCode");
	    	    
	    long responseTime = response.getTime();
	    Assert.assertTrue(responseTime<2000,"ResponseTime is too long");
	    
	    String responseHeader = response.getHeader("content-type");	  
	    Assert.assertTrue(responseHeader.contains("application/json"), "Invalid Contenttype");
	    
	    String responseName = response.jsonPath().getString("name");
	    String responseJob = response.jsonPath().getString("job");
	    long responsePhoneNumber = response.jsonPath().getLong("phoneNumber");
	    int responseID = response.jsonPath().getInt("id");
	    
	    Assert.assertEquals(responseName, "kalyan", "Invalid Name");
	    Assert.assertEquals(responseJob, "Automation Test Engineer", "Invalid Job");
	    Assert.assertEquals(responsePhoneNumber, 7337279857L);
	    Assert.assertEquals(responseID, 9857);    
		      		
	}
	
	public static void jsonPayloadTest()
	{
		JSONObject json = new JSONObject();
		json.put("userName", "Kalyan");
		json.put("Job", "Automation Test Engineer");
		json.put("JobID", "9857");
		json.put("mobilrNumber", "7337279857");
		
		Header h1 = new Header("content-Type" , "application/json");
		Header h2 = new Header("accept" , "application/json");
		Header h3 = new Header("Authorization" , "token");
		Header h4 = new Header("cache-control" , "no-cache");
		Header h5 = new Header("cookies" , "session=1; user=2");
		
		Headers head = new Headers(h1,h2,h3,h4,h5);
		
		RestAssured.baseURI = "https://google.com";
		
		Response res = RestAssured.given()
		
		.headers(head)
		.body(json.toString())
		.pathParam("user", "/users")
		
		.when()
		
		.post("/{user}")
		
		.then()
		
		.extract()
		.response();
		
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getContentType());
		System.out.println(res.getCookie("cookies"));
		System.out.println(res.getHeader("content-Type"));
		System.out.println(res.getTime());
		System.out.println(res.getBody());
		System.out.println(res.getCookies());
		System.out.println(res.getHeaders());
		
	Assert.assertEquals(res.getStatusCode(), 201, "Invalid StatusCode");
	
	long responseTime = res.getTime();
	Assert.assertTrue(responseTime<2000, "ResponseTime is too long");
	
	String header = res.getHeader("content-Type");
	Assert.assertTrue(header.contains("application/json"), "Invalid Header");
	
	String name = res.jsonPath().getString("userName");
	String Job = res.jsonPath().getString("Job");
	String JobID = res.jsonPath().getString("JobID");
	String mobileNumber = res.jsonPath().getString("mobilrNumber");
	
	Assert.assertEquals(name, "Kalyan", "Name mismatched");
	Assert.assertEquals(Job, "Automation Test Engineer", "Job mismatched");
	Assert.assertEquals(JobID, "9857", "JobID mismatched");
	Assert.assertEquals(mobileNumber, "7337279857", "mobileNumber mismatched");
		
	}
	
	public static void payloadWithJson()
	{
		JSONObject json = new JSONObject();
		json.put("userName", "Kalyan");
		json.put("Job", "Automation Test Engineer");
		json.put("JobID", "9857");
		json.put("mobilrNumber", "7337279857");
		
		RestAssured.baseURI = "https://google.com";
		Response res = RestAssured.given()
		.contentType("application.json")
		.body(json.toString())
		
		.when()
		.post("/users/api")
		
		.then()
		.extract()
		.response();
		
		int statusCode = res.getStatusCode();
		long responseTime = res.getTime();
		String header = res.getHeader("content-Type");	
		String response = res.asPrettyString();
		String name = res.jsonPath().getString("username");
		String job = res.jsonPath().getString("Job");
		String jobID = res.jsonPath().getString("JobID");
		String mobileNumber = res.jsonPath().getString("mobileNumber");
		
		Assert.assertEquals(statusCode, 201, "Invalid StatusCode");
		Assert.assertTrue(responseTime > 2000, "Response time is too long");
		Assert.assertTrue(header.contains("application/json"), "Invalid Header");
		Assert.assertEquals(name, "kalyan", "InvalidName");
		Assert.assertEquals(job, "tester", "Invalidjob");
		Assert.assertEquals(jobID, "9857", "InvalidjobID");
		Assert.assertEquals(mobileNumber, "7337279857", "InvalidNamber");
		
	}

}
