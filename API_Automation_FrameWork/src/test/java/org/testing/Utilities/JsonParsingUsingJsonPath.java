package org.testing.Utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{
	public static String JsonParse(Response res, String jsonPath)
	{
		return res.jsonPath().getString(jsonPath);
	}
}
