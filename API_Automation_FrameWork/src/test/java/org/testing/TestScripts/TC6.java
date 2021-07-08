package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesFile;
import org.testng.annotations.Test;

public class TC6 
{
	@Test
	public void deleteReqTC() throws IOException
	{
		Properties p = PropertiesFile.readproperties("../API_Automation_FrameWork/URI.properties");
		HTTP_Methods http = new HTTP_Methods(p);
		http.DeleteRequest("QA_URI", TC1.responseIDValue);
	}
}
