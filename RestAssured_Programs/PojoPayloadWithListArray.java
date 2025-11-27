package RestAssured_Programs;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

// If pojo class should be in different packages then we can import pojo class by using package name.classname then cretae object
// If pojo class should be in same packages then no need to import dirrectly create an object
// second way is make everything as public static then directly we can access

class PojoPayloadWithListArray 
{
	private String name;
	private String job;
	private int jobID;
	private List<String> jobRoles;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getname() 
	{
		return name;		
	}
	
	public void setJob(String job)
	{
		this.job = job;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public void setJobID(int jobID)
	{
		this.jobID = jobID;
	}
	
	public int getJobID()
	{
		return jobID;
	}
	
	public void setJobRoles(List<String> jobRoles)
	{
		this.jobRoles = jobRoles;
	}
	
	public List<String> getJobRoles()
	{
		return jobRoles;
	}
	
	public void pojoPayloadList()
	{
		PojoPayloadWithListArray payload = new PojoPayloadWithListArray();
		
		payload.setName("kalyan");
        payload.setJob("Automation Test Engineer");
        payload.setJobID(9857);
        
        List<String> listJobs = new ArrayList<>();
        
        listJobs.add("Java Developer");
        listJobs.add("Data Analyst");
        listJobs.add("Quality Assurence Engineer");
        
        payload.setJobRoles(listJobs);
        
        RestAssured.baseURI = "https://testautomationpractice.blogspot.com/"; // ----> this is one way 
		
		//String base_Uri = "https://testautomationpractice.blogspot.com/";    // ----> second way
		
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
		     .body(payload.toString())		
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
	    
//	    String responseHeader = response.getHeader("content-type");	  
//	    Assert.assertTrue(responseHeader.contains("application/json"), "Invalid Contenttype");
//	    
//	    String responseName = response.jsonPath().getString("name");
//	    String responseJob = response.jsonPath().getString("job");
//	    long responsePhoneNumber = response.jsonPath().getLong("phoneNumber");
//	    int responseID = response.jsonPath().getInt("id");
//	    
//	    Assert.assertEquals(responseName, "kalyan", "Invalid Name");
//	    Assert.assertEquals(responseJob, "Automation Test Engineer", "Invalid Job");
//	    Assert.assertEquals(responsePhoneNumber, 7337279857L);
//	    Assert.assertEquals(responseID, 9857);    
        
        
	}
}

class pojoPayloadWithList
{
	private String name;
	private List<String> topics;
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setListTopics(List<String> topics)
	{
		this.topics = topics;
	}
	
	public static void payloadWithList()
	{
		pojoPayloadWithList load = new pojoPayloadWithList();
		pojoPayloadWithList arrayLoad = new pojoPayloadWithList();
		load.setName("kalyan");
		List<String> list = new ArrayList<>();
		
		list.add("botany");
		list.add("chemistry");
		list.add("physics");
		
		arrayLoad.setListTopics(list);	
		
	}
}

class listPayload
{
	private String name;
	private List<String> jobRoles;
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setJobRoles(List<String> jobRoles)
	{
		this.jobRoles = jobRoles;
	}
	
	List<String> getJobRoles()
	{
		return jobRoles;
	}
	
	public static void payloadWithArray() 
	{
		listPayload payload = new listPayload();
		
		payload.setName("kalyan");
		
        List<String> list = new ArrayList<>();
		
		list.add("Automation Tester");
		list.add("Java Developeer");
		list.add("Devops Engineer");
		
		payload.setJobRoles(list);	
		
		 RestAssured.baseURI = "https://testautomationpractice.blogspot.com/"; // ----> this is one way 
			
			//String base_Uri = "https://testautomationpractice.blogspot.com/";    // ----> second way
			
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
			     .body(payload.toString())		
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
		 
		    
//		    String responseHeader = response.getHeader("content-type");	  
//		    Assert.assertTrue(responseHeader.contains("application/json"), "Invalid Contenttype");
//		    
//		    String responseName = response.jsonPath().getString("name");
//		    String responseJob = response.jsonPath().getString("job");
//		    long responsePhoneNumber = response.jsonPath().getLong("phoneNumber");
//		    int responseID = response.jsonPath().getInt("id");
//		    
//		    Assert.assertEquals(responseName, "kalyan", "Invalid Name");
//		    Assert.assertEquals(responseJob, "Automation Test Engineer", "Invalid Job");
//		    Assert.assertEquals(responsePhoneNumber, 7337279857L);
//		    Assert.assertEquals(responseID, 9857);       
			
	}
}

class pojoPayloadWithListCollection
{
	private String name;
	private String jobRole;
	private long mobileNumber;
	private boolean status;
	private List<String> topics;
	
	public pojoPayloadWithListCollection(String name, String jobRole, long mobileNumber, boolean status)
	{
		this.name = name;
		this.jobRole = jobRole;
		this.mobileNumber = mobileNumber;
		this.status = status;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setJobRole(String jobRole)
	{
		this.jobRole = jobRole;
	}
	
	String getJobRole()
	{
		return jobRole;
	}
	
	void setMobileNumber(long mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	
	long getMobileNumber()
	{
		return mobileNumber;
	}	
	
	void setStatus(boolean status)
	{
		this.status = status;
	}
	
	boolean getStatusName()
	{
		return status;
	}
	
	void setTopics(List<String> topics)
	{
		this.topics = topics;
	}
	
	List<String> getTopics()
	{
		return topics;
	}	
	
	void finalStatus()
	{
		pojoPayloadWithListCollection pp = new pojoPayloadWithListCollection("kalyan" , "Automation Tester" , 98576473783l, true);
	
		pp.setName("kalyan");
		pp.setJobRole("Tester");
		pp.setMobileNumber(784683030l);
		pp.setStatus(true);
		
		System.out.println(pp.getJobRole());
		System.out.println(pp.getMobileNumber());
		System.out.println(pp.getName());
		System.out.println(pp.getTopics());
		
		List<String> list = new ArrayList<>();
		list.add("English");
		list.add("Maths");
		list.add("Science");
		
		pp.setTopics(list);
		
		RestAssured.baseURI = "https://testautomationpractice.blogspot.com/";
		
		Header header = new Header("contentType" , "application/json");
		Header header1 = new Header("authorixation" , "token paste");
		Header header2 = new Header("accept" , "application/json");
		Header header3 = new Header("cache-control" , "no-cache");
		Header header4 = new Header("cookie" , "requires = 2 ; user = 1");
		
		Headers headers = new Headers(header,header1,header2,header3,header4);
		
		
		Response response = RestAssured
				
				.given()
				     .contentType("application.json")
				     .headers(headers)				  
				     .body(pp.toString())		
				.when()
				    
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
	}
}



