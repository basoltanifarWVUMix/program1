package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GeneralDivisionTest extends TestBase {

	private String number1;
	private String number2;
	private String expected;

	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().division(number1, number2));

	}

	public GeneralDivisionTest(String number1, String number2, String expected) {
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "8", "4", "2" },{ "8.3", "4", "2.075" }, { "0b1000", "0b100", "0b10" }, { "010", "04", "02" },
				{ "0X8", "0X4", "0X2" }

		});
	}

}
