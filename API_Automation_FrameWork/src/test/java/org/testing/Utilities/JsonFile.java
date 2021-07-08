package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFile 
{
	public static String readJson(String pathname) throws FileNotFoundException
	{
		File f = new File(pathname);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject ob = new JSONObject(jt);
		
		return ob.toString();
	}
}
