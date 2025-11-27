package RestAssured_Programs;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreatingJsonArray_WithJsonPack
{
	@Test
	public static void creatingJsonArrayPayload()
	{
		
		// Approach 1 Cretating Simple array. Output is ["Java","Selenium","API Testing"];
		JSONArray array = new JSONArray();  
		
		array.put("Java");
		array.put("Selenium");
		array.put("API Testing");
		
		System.out.println(array.toString());
		
		// Approach 2 Creating arrays with Object. OutPut {"Fruits":["Apple","mango","orange","dragon fruit"]}
		
		JSONArray array1 = new JSONArray();
		JSONObject object1 = new JSONObject();
		
		array1.put("Apple");
		array1.put("mango");
		array1.put("orange");
		array1.put("dragon fruit");
		
		object1.put("Fruits", array1);
		System.out.println(object1.toString());
		
		JSONArray array2 = new JSONArray();
		JSONObject object2 = new JSONObject();
		
		array2.put("Botany");
		array2.put("zoology");
		array2.put("chemistry");
		array2.put("physics");
		
		object2.put("Topics", array2);
		System.out.println(object2.toString());
		
		// Approach 3 Creating Array inside Object (Object Array) OutPut : [{"phoneNumber":7337279832,"name":"renu","job":"Automation Test Engineer","userId":9858,"status":"active"},{"phoneNumber":7337279217,"name":"pavan","job":"Automation Test Engineer","userId":9859,"status":"active"},
		
		JSONObject object3 = new JSONObject();		
		JSONObject mainObject = new JSONObject();
		JSONArray array3 = new JSONArray();
		
		object3.put("name", "renu");
		object3.put("job", "Automation Test Engineer");
		object3.put("userId", 9858);
		object3.put("phoneNumber", 7337279832l);
		object3.put("status", "active");
		
		JSONObject object4 = new JSONObject();		
		
		object4.put("name", "pavan");
		object4.put("job", "Automation Test Engineer");
		object4.put("userId", 9859);
		object4.put("phoneNumber", 7337279217l);
		object4.put("status", "active");
		
		JSONObject object5 = new JSONObject();		
		
		object5.put("name", "anjan");
		object5.put("job", "Automation Test Engineer");
		object5.put("userId", 9860);
		object5.put("phoneNumber", 7337322857l);
		object5.put("status", "active");
		
		array3.put(object3);
		array3.put(object4);
		array3.put(object5);
		
		mainObject.put("empDetails", array3);
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

class JsonArrayPayload
{
	@Test
	void josnObjectArrayPayload()
	{
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonMainObj = new JSONObject();
		
		jsonArray.put("English");
		jsonArray.put("Maths");
		jsonArray.put("Science");
		
		System.out.println(jsonArray);
		
		jsonObj.put("name", "kalyan");
		jsonObj.put("job", "Automation Test Engineer");
		jsonObj.put("userId", 9858);
		jsonObj.put("phoneNumber", 7337279832l);
		jsonObj.put("status", "active");
		
		jsonArray.put(jsonObj);
		
		System.out.println(jsonArray);
		
		JSONObject jsonObj1 = new JSONObject();
		
		jsonObj1.put("name", "kalyan");
		jsonObj1.put("job", "Automation Test Engineer");
		jsonObj1.put("userId", 9858);
		jsonObj1.put("phoneNumber", 7337279832l);
		jsonObj1.put("status", "active");
		
        JSONObject jsonObj2 = new JSONObject();
		
        jsonObj2.put("name", "pavan");
        jsonObj2.put("job", "Automation Test Engineer");
        jsonObj2.put("userId", 9858);
        jsonObj2.put("phoneNumber", 7337279832l);
        jsonObj2.put("status", "active");
        
        JSONObject jsonObj3 = new JSONObject();
		
        jsonObj3.put("name", "renu");
        jsonObj3.put("job", "Automation Test Engineer");
        jsonObj3.put("userId", 9858);
        jsonObj3.put("phoneNumber", 7337279832l);
        jsonObj3.put("status", "active");
        
        jsonArray.put(jsonObj1);
        jsonArray.put(jsonObj2);
        jsonArray.put(jsonObj3);
        
        jsonMainObj.put("EmployeeDetails", jsonArray);
        
        RestAssured.baseURI = "https://google.com";
		
		Response res = RestAssured
		
		.given()
		.contentType("application.json")
		.body(jsonMainObj)
		
		.when()
		.post("/users")
		
		.then()
		.statusCode(201)
		.extract()
		.response();
		
		System.out.println(res.toString());
        
		
		
	}
}