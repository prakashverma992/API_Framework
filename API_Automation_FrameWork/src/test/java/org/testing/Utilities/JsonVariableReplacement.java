package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement 
{
	public static String jsonReplace(String data, String variableName, String replacedValue)
	{
		data = data.replaceAll(Pattern.quote("{{"+variableName+"}}"), replacedValue);
		return data; 
	}
}
