package org.testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTP_Methods 
{
	Properties pr;
	public HTTP_Methods(Properties pr)
	{
		this.pr = pr;	
	}
	public Response PostRequest(String uriKey, String payload)
	{
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post(pr.getProperty(uriKey));
		System.out.println("Post Response Status Code is : "+res.statusCode());
		return res;
	}
	
	public Response GetRequest(String uriKey)
	{
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
		return res;
	}
	
	public Response GetRequest(String uriKey, String pathParameter)
	{
		String uri = pr.getProperty(uriKey)+"/"+pathParameter;
		System.out.println("URI: "+uri);
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		return res;
	}

	//add all key:value to update including existing data also
	public Response PutRequest(String uriKey, String updatepayload, String pathParameter)
	{
		String uri = pr.getProperty(uriKey)+"/"+pathParameter;
		System.out.println("URI: "+uri);
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(updatepayload)
				.when()
				.put(uri);
		return res;
	}
	
	//only add those key:value to update except id(ie.primary key)
	public Response PatchRequest(String uriKey, String newpayload, String pathParameter)
	{
		String uri = pr.getProperty(uriKey)+"/"+pathParameter;
		System.out.println("URI: "+uri);
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(newpayload)
				.when()
				.patch(uri);
		return res;
	}
	
	public void DeleteRequest(String uriKey, String pathParameter)
	{
		String uri = pr.getProperty(uriKey)+"/"+pathParameter;
		System.out.println("URI: "+uri);
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		
		System.out.println("\nDelete Response status code: "+res.statusCode());
	}
}
