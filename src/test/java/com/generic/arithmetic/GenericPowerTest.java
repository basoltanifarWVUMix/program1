package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GenericPowerTest extends TestBase {
	private String number1;
	private String number2;
	private String expected;

	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().power(number1, number2));

	}

	public GenericPowerTest(String number1, String number2, String expected) {
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "8", "4", "4096" },{ "8.2", "4", "4521.218" }, { "0b1000", "0b100", "0b1000000000000" },
				{ "010", "04", "010000" }, { "0X8", "0X4", "0X1000" }

		});
	}

}
