package org.testing.Utilities;

import java.util.Random;

public class RandomInteger 
{
	public static Integer generateRandomInteger()
	{
		Random r = new Random();
		Integer num = r.nextInt();
		return num;
	}
}
