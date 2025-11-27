package RestAssured_Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CreatingJsonArray_WithGsonPack
{
	@Test
	public static void createJsonArrayPayload()
	{
		// Approach 1 Creating simple array
		
		JsonObject object1 = new JsonObject();  
		JsonArray array1 =  new JsonArray();
		
		array1.add("name");
		array1.add("job");
		array1.add("jobRole");
		
		System.out.println(array1.toString());  // OutPut : ["name","job","jobRole"]		
		
		// Approach 2 Creating array and adding into object
		
		JsonObject object2 = new JsonObject();  
		JsonArray array2 =  new JsonArray();
		
		array2.add("name");
		array2.add("job");
		array2.add("jobRole");
		
		System.out.println(array2.toString());
		
		object2.add("User", array2);
		
		System.out.println(object1.toString());   // {"User":["name","job","jobRole"]}
		
		// Approach 3 Creating ObjectArray Array inside object
		
		JsonObject mainObject = new JsonObject();  
		JsonObject object3 = new JsonObject();  		
		JsonArray array3 =  new JsonArray();
		
		object3.addProperty("name","kalyan");
		object3.addProperty("job", "automation test engineer");
		object3.addProperty("id", 9857);
		object3.addProperty("status", "inactive");
		
		JsonObject object4 = new JsonObject();  
		
		object4.addProperty("name","kalyan");
		object4.addProperty("job", "automation test engineer");
		object4.addProperty("id", 9857);
		object4.addProperty("status", "inactive");
		
		JsonObject object5 = new JsonObject(); 
		
		object5.addProperty("name","kalyan");
		object5.addProperty("job", "automation test engineer");
		object5.addProperty("id", 9857);
		object5.addProperty("status", "inactive");
		
		array3.add(object3);
		array3.add(object4);
		array3.add(object5);
		
		mainObject.add("employee", array3);  // {"employee":[{"name":"kalyan","job":"automation test engineer","id":9857,"status":"inactive"},{"name":"kalyan","job":"automation test engineer","id":9857,"status":"inactive"},{"name":"kalyan","job":"automation test engineer","id":9857,"status":"inactive"}]}
		
		System.out.println(mainObject.toString());
		
        RestAssured.baseURI = "https://google.com";
		
		Response res = RestAssured
		
		.given()
		.contentType("application.json")
		.body(mainObject)
		
		.when()
		.post("/users")
		
		.then()
		.statusCode(201)
		.extract()
		.response();
		
		System.out.println(res.toString());		
	}

}

class gsonArray
{
	
	public static void gsonArrayPayload()
	{
		JsonObject json = new JsonObject();
		JsonObject jsonMain = new JsonObject();
		JsonArray array = new JsonArray();
		
		// First Example
		array.add("kalyan");
		array.add("Automation Tester");
		array.add("Ahana Systems");
		
		System.out.println(array.toString());
		
		//Second Example
		json.addProperty("name", "kalyan");
		json.addProperty("job", "Automation Tester");
		json.addProperty("company", "Ahana Systems");
		
		array.add(json);
		
		System.out.println(array.toString());
		
		JsonObject json1 = new JsonObject();
		
		json1.addProperty("name", "kalyan");
		json1.addProperty("job", "Automation Tester");
		
        JsonObject json2 = new JsonObject();
		
        json2.addProperty("name", "kalyan");
        json2.addProperty("job", "Automation Tester");
		
		JsonObject json3 = new JsonObject();
		
		json3.addProperty("name", "kalyan");
		json3.addProperty("job", "Automation Tester");
		
		array.add(json);
		array.add(json1);
		array.add(json2);
		array.add(json3);
		
		jsonMain.add("EmployeeDetails", array);		
	}
	
}

class RequestPayloadWithArray
{
	@Test
	void requestPayloadWithArray()
	{
		
		JsonArray array = new JsonArray();		
		
		array.add("Automation Tester");
		array.add("Java Developper");
		array.add("Python Developper");
		
		System.out.println(array);
		
		JsonObject jsonMain = new JsonObject();
		JsonObject json = new JsonObject();
		
		json.addProperty("Name", "Kalyan");
		json.addProperty("Job", "Automation Tester");
		json.addProperty("PhoneNumber", 7337279857l);
		json.addProperty("Status", "active");
		
		array.add(json);
		
		System.out.println(array.toString());
		
		JsonObject jsonMainObj = new JsonObject();
		JsonObject json1 = new JsonObject();
		
		json1.addProperty("Name", "Pavan");
		json1.addProperty("Job", "Java Developer");
		json1.addProperty("PhoneNumber", 7337279857l);
		json1.addProperty("Status", "in active");
		
        JsonObject json2 = new JsonObject();
		
        json2.addProperty("Name", "Renu");
        json2.addProperty("Job", "Devops Developer");
        json2.addProperty("PhoneNumber", 7398579857l);
        json2.addProperty("Status", "active");
        
        JsonObject json3 = new JsonObject();
		
        json3.addProperty("Name", "Anjan");
        json3.addProperty("Job", "Devops Engineer");
        json3.addProperty("PhoneNumber", 7398579857l);
        json3.addProperty("Status", "active");
        
        JsonArray array1 = new JsonArray();
        
        array1.add(json1);
        array1.add(json2);
        array1.add(json3);
        
        jsonMainObj.add("EmployeDetails", array1);
        
        Header head1 = new Header("authorization" , "token");
        Header head2 = new Header("accept" , "application/json");
        
        Headers head = new Headers(head1 , head2);
        
        RestAssured.baseURI = "https://google.com";
        
        Response response =  
        RestAssured.given()
        
        .contentType("application.json")
        .headers(head)
        .pathParam("users", 2)
        .body(jsonMainObj.toString())
        
        .when()
        
        .post("/users")
        
        .then()
        
        .extract()
        .response();
        
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getContentType());
        System.out.println(response.getHeader("autorization"));
        System.out.println(response.getTime());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
        
        int statusCode = response.getStatusCode();
        String contentType =  response.getContentType();
        String header = response.getHeader("autorization");
        long responsetime = response.time();		
	}
}
















