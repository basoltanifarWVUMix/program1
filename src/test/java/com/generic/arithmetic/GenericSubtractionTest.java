package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class GenericSubtractionTest extends TestBase {
	private String number1;
	private String number2;
	private String expected;

	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().subtraction(number1, number2));

	}

	public GenericSubtractionTest(String number1, String number2, String expected) {
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "8.2", "4", "4.2" }, { "12", "13", "-1" }, { "0b1000", "0b100", "0b100" },
				{ "010", "04", "04" }, { "0X8", "0X4", "0X4" }

		});
	}

}
