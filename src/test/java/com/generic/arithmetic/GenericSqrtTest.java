package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GenericSqrtTest extends TestBase {
	private String number1;
	private String expected;

	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().sqrt(number1));

	}

	public GenericSqrtTest(String number1, String expected) {
		this.number1 = number1;
		this.expected = expected;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "8", "2.828427" },{ "8.2", "2.8635643" }, { "0b1000", "0b10" }, { "010", "02" }, { "0X8", "0X2" }

		});
	}

}