package org.testing.Assertion;

public class Assert_1 
{
	public static void assertion(String actual, String expected)
	{
		if(expected.equals(actual))
		{
			System.out.println("Verification successfull.");
		}
		else
		{
			System.out.println("Verification failed!!!!");
		}
	}
}
