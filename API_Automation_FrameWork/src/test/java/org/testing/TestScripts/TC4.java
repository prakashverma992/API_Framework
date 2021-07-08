package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.JsonFile;
import org.testing.Utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 
{
	@Test
	public void putRequestTC() throws IOException
	{
		Properties p = PropertiesFile.readproperties("../API_Automation_FrameWork/URI.properties");
		String data = JsonFile.readJson("../API_Automation_FrameWork/src/test/java/org/testing/Resources/putRequest.json");
		HTTP_Methods http = new HTTP_Methods(p);
		Response res = http.PutRequest("QA_URI", data, TC1.responseIDValue);
		System.out.println("\nPut Response status code: "+res.statusCode());
		System.out.println("Put Response Data: "+res.asString());
		System.out.println();
	}
}
