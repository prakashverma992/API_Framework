package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2
{
	@Test
	public void getRequestTC() throws IOException
	{
		Properties p = PropertiesFile.readproperties("../API_Automation_FrameWork/URI.properties");
		HTTP_Methods http = new HTTP_Methods(p);
		Response res = http.GetRequest("QA_URI", TC1.responseIDValue);
		System.out.println("\nGet Response status code: "+res.getStatusCode());
		System.out.println("Get Response Data: "+res.asString());
		System.out.println();
	}
}
