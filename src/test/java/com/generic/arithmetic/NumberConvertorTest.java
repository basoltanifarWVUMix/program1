package com.generic.arithmetic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumberConvertorTest extends TestBase {
	private String decimal;
	private String binary;
	private String octal;
	private String hexa;

	@Test
	public void convert() {
		Map<String, String> result = getArithmetic().numberBaseConvertor("56");

		result.forEach((key, value) -> {
			System.out.println("base " + key + " value is " + value);

		});

		if (result.containsValue(decimal) && result.containsValue(binary) && result.containsValue(octal)
				&& result.containsValue(hexa)) {
			Assert.assertTrue(true);

		} else {
			Assert.assertFalse(false);
		}

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "56", "ob1111000", "070", "0X38" },

		});
	}

	public NumberConvertorTest(String decimal, String binary, String octal, String hexa) {
		this.decimal = decimal;
		this.binary = binary;
		this.octal = octal;
		this.hexa = hexa;

	}

}
