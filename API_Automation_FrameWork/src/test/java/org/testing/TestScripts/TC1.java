package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.JsonFile;
import org.testing.Utilities.JsonParsingUsingOrgJSON;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesFile;
import org.testing.Utilities.RandomInteger;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 
{
	static String responseIDValue;
	@Test
	public void postRequestTC() throws IOException
	{
		Integer i = RandomInteger.generateRandomInteger();
		Properties p = PropertiesFile.readproperties("../API_Automation_FrameWork/URI.properties");
		String data = JsonFile.readJson("../API_Automation_FrameWork/src/test/java/org/testing/Resources/postRequest.json");
		data = JsonVariableReplacement.jsonReplace(data, "id", i.toString());
		HTTP_Methods http = new HTTP_Methods(p);
		Response res = http.PostRequest("QA_URI", data);
		responseIDValue = JsonParsingUsingOrgJSON.JsonParse(res.asString(), "id");
		System.out.println("Parsed ID(Primary Key) of TC1: "+responseIDValue);
		System.out.println();
	}
}
