package org.testing.Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString 
{
	public static String generateRandomString(int count)
	{
		return RandomStringUtils.randomAlphanumeric(count);
	}
}
