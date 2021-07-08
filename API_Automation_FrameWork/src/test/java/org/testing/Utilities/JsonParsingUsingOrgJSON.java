package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJSON 
{
	public static String JsonParse(String data, String extractKey)
	{
		if(data.startsWith("{"))
		{
			JSONObject jo = new JSONObject(data);
			return jo.getString(extractKey);
		}
		return extractKey;
	}
	
	public static String JsonParse(String data, String extractKey, int index)	//method overloading
	{
		if(data.startsWith("["))
		{
			JSONArray array = new JSONArray(data);
			int length = array.length();
			if(index<length)
			{
				JSONObject ob = array.optJSONObject(index);
				return ob.getString(extractKey);				//for simple json
			}
			else
			{
				System.out.println("You have given array length greater than: "+length);
			}
		}
		return extractKey;
	}
}
