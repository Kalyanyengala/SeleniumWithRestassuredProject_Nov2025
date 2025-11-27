package RestAssured_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostCallWithPojoPayload 
{
	private String caustomerName;
	private String bankName;
	private long phoneNumber;
	private int id;
	 
	
	// Constructor creation is optional but for my practice i was creating
	
	public PostCallWithPojoPayload(String caustomerName, String bankName, long phoneNumber , int id)  
	{
		this.caustomerName = caustomerName;
		this.bankName = bankName;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}
	
	public void setcaustomerName(String caustomerName)
	{
		this.caustomerName = caustomerName;
	}
	
	public String getCaustomerName()
	{
		return caustomerName;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int setId()
	{
		return id;
	}
	
	public static void payloadAccess()
	{
		PostCallWithPojoPayload pojo = new PostCallWithPojoPayload("kalyan" , "HdfcBank" , 7337279857l , 9857);
		
		pojo.setcaustomerName("kalyanYengala");
		pojo.setBankName("HDFCBank");
		pojo.setPhoneNumber(7337279857l);
		pojo.setId(9857);
		
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
		.body(pojo.toString())
		
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


class pojoPayload
{
	
	private String name;
	private String comapany;
	private String jobRole;
	private int id;
	
    public pojoPayload(String name, String comapany, String jobRole, int id)
    {
    	this.name = name;
    	this.comapany = comapany;
    	this.jobRole = jobRole;
    	this.id = id;
    }
    
    void setName(String name)
    {
    	this.name = name;
    }
    
    String getName()
    {
    	return "kalyan";
    }
    
    void setJobCompany(String comapany)
    {
    	this.comapany = comapany;
    }
    
    String getJobCompany()
    {
    	return "Ahana Systems PvtLtd";
    }
    
    void setJobRole(String jobRole)
    {
    	this.jobRole = jobRole;
    }
    
    String getJobRole()
    {
    	return "Automation Test Engineer";
    }
    
    void setId(int id)
    {
    	this.id = id;
    }
    
    int getId()
    {
    	return 9857;
    }	
    
    public void pojoPayloadMethod()
    {
    	pojoPayload payload = new pojoPayload("kalyan", "Ahana Systems PvtLtd" , "Automation Test Engineer" , 9857);
    	
    	payload.setId(9857);
    	payload.setJobRole("Automation Test Engineer");
    	payload.setJobCompany("Ahana Systems PvtLtd");
    	payload.setName("Kalyan");
    	
    	payload.getId();
    	payload.getJobCompany();
    	payload.getJobRole();
    	payload.getName();
    	
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
		.body(payload.toString())
		
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

class pojoPayloadToPostCall
{
	private String name;
	private String jobRole;
	private int ID;
	private long phoneNumber;
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setjobRole(String jobRole)
	{
		this.jobRole=jobRole;
	}
	String getjobRole()
	{
		return jobRole;
	}
	void setID(int ID)
	{
		this.ID=ID;
	}
	int getID()
	{
		return ID;
	}
	void setphoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	long getphoneNumber()
	{
		return phoneNumber;
	}
	
	public static void postPayload()
	{
		pojoPayloadToPostCall po = new pojoPayloadToPostCall();
		
		po.setName("Kalyan");
		po.setID(9857);
		po.setjobRole("Automation Test Engineer");
		po.setphoneNumber(7337279857l);
		
		RestAssured.baseURI = "https://google.com";
		
		Response res = RestAssured.given()
		
		.body(po.toString())
		.contentType("application.json")
		.pathParam("user", 4)
		
		.when()
		
		.post("/user")
		
		.then()
		
		.extract()
		.response();
		
		
		
		System.out.println("Printing response :" + res.asString());
	    System.out.println("Printing statusCode :" + res.getStatusCode());
	    
	    long responseTime = res.getTime();
	    String header = res.getHeader("content-Type");
	    String name = res.jsonPath().getString("name");
	    String role = res.jsonPath().getString("role");
	    int age = res.jsonPath().getInt("age");
	    
	   Assert.assertEquals(res.getStatusCode(), 201, "Statuscode Invalid");
	   Assert.assertTrue( responseTime < 2000 , "Responsetime is too lone");
	   Assert.assertTrue(header.contains("application/json"), "Invalid Header");
	   Assert.assertEquals(name, "Kalyan", "InvalidName");
	   Assert.assertEquals(role, "Automation Tester", "Role Mismatched");
	   Assert.assertEquals(age, 27, "Age mismatched");	
		
	}	
}