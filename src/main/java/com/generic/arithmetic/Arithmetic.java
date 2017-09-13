package com.generic.arithmetic;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Arithmetic {
	public String addition(String num1, String num2) {
		Integer add;

		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {
			add = convertBinarytoInteger(num1) + convertBinarytoInteger(num2);
			return ("0b" + Integer.toBinaryString(add));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {

			add = convertHexaToIneger(num1) + convertHexaToIneger(num2);
			return ("0X" + Integer.toHexString(add));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {

			add = convertOctalToInteger(num1) + convertOctalToInteger(num2);
			return ("0" + Integer.toOctalString(add));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\+|-)?([.0-9]+)")) {

			if (num1.contains(".") || num2.contains(".")) {
				double result = convertStringToDecimal(num1) + convertStringToDecimal(num2);
				return ("" + result);
			} else {
				add = convertStringToInteger(num1) + convertStringToInteger(num2);
				return (add.toString());
			}

		} else {
			System.out.println("worng format!!!");
		}

		return null;

	}

	public String subtraction(String num1, String num2) {
		Integer sub;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			sub = convertBinarytoInteger(num1) - convertBinarytoInteger(num2);
			return ("0b" + Integer.toBinaryString(sub));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {

			sub = convertHexaToIneger(num1) - convertHexaToIneger(num2);
			return ("0X" + Integer.toHexString(sub));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			sub = convertOctalToInteger(num1) - convertOctalToInteger(num2);
			return ("0" + Integer.toOctalString(sub));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\+|-)?([.0-9]+)")) {

			if (num1.contains(".") || num2.contains(".")) {
				Double result = convertStringToDecimal(num1) - convertStringToDecimal(num2);
				return ("" + result.floatValue());
			} else {
				sub = convertStringToInteger(num1) - convertStringToInteger(num2);
				return (sub.toString());
			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String multiplication(String num1, String num2) {
		Integer mul;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			mul = convertBinarytoInteger(num1) * convertBinarytoInteger(num2);
			return ("0b" + Integer.toBinaryString(mul));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {
			mul = convertHexaToIneger(num1) * convertHexaToIneger(num2);
			return ("0X" + Integer.toHexString(mul));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {
			
			mul = convertOctalToInteger(num1) * convertOctalToInteger(num2);
			return ("0" + Integer.toOctalString(mul));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {
			if (num1.contains(".") || num2.contains(".")) {
				Double result = convertStringToDecimal(num1) * convertStringToDecimal(num2);
				return ("" + result.floatValue());
			} else {
				mul = convertStringToInteger(num1) * convertStringToInteger(num2);
				return (mul.toString());
			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String division(String num1, String num2) {
		Integer div;
		// Integer div;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			div = divResult(convertBinarytoInteger(num1), convertBinarytoInteger(num2));

			return ("0b" + Integer.toBinaryString(div));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {

			div = divResult(convertHexaToIneger(num1), convertHexaToIneger(num2));

			return ("0X" + Integer.toHexString(div));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {

			div = divResult(convertOctalToInteger(num1), convertOctalToInteger(num2));

			return ("0" + Integer.toOctalString(div));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {

			if (num1.contains(".") || num2.contains(".")) {

				Double result = divResult((Double) convertStringToDecimal(num1), (Double) convertStringToDecimal(num2));
				try {
					return ("" + result);
				} catch (Exception e) {

				}
			} else {
				div = divResult(convertStringToInteger(num1), convertStringToInteger(num2));

				try {
					return (div.toString());
				} catch (Exception e) {

				}
			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String power(String num1, String num2) {
		Integer power;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			power = (int) Math.pow(convertBinarytoInteger(num1), convertBinarytoInteger(num2));

			return ("0b" + Integer.toBinaryString(power));
		} else if (num1.toLowerCase().startsWith("0x") && num2.toLowerCase().startsWith("0x")) {

			power = (int) Math.pow(convertHexaToIneger(num1), convertHexaToIneger(num2));

			return ("0X" + Integer.toHexString(power));

		} else if (num1.toLowerCase().startsWith("0") && num2.toLowerCase().startsWith("0")) {

			power = (int) Math.pow(convertOctalToInteger(num1), convertOctalToInteger(num2));
			return ("0" + Integer.toOctalString(power));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)") && num2.matches("(\\\\+|-)?([.0-9]+)")) {

			if (num1.contains(".") || num2.contains(".")) {
				Float floatPower = (float) Math.pow(convertStringToDecimal(num1), convertStringToDecimal(num2));
				return ("" + floatPower.floatValue());
			} else {
				power = (int) Math.pow(convertStringToInteger(num1), convertStringToInteger(num2));
				return (power.toString());
			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public String sqrt(String num1) {
		Integer sqrt;
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			sqrt = (int) Math.sqrt(convertBinarytoInteger(num1));
			return ("0b" + Integer.toBinaryString(sqrt));
		} else if (num1.toLowerCase().startsWith("0x")) {
			sqrt = (int) Math.sqrt(convertHexaToIneger(num1));
			return ("0X" + Integer.toHexString(sqrt));

		} else if (num1.toLowerCase().startsWith("0")) {

			sqrt = (int) Math.sqrt(convertOctalToInteger(num1));
			return ("0" + Integer.toOctalString(sqrt));

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)")) {

			Float floatSqrt;
			if (num1.contains(".")) {
				floatSqrt = (float) Math.sqrt(convertStringToDecimal(num1));
				return ("" + floatSqrt);
			} else {

				floatSqrt = (float) Math.sqrt(convertStringToInteger(num1));
				return ("" + floatSqrt);
			}

		} else {
			System.out.println("worng format!!!");
		}
		return null;

	}

	public Map<String, String> numberBaseConvertor(String num1) {
		Map<String, String> conver = new HashMap<String, String>();
		if (num1.toLowerCase().startsWith("0b") && num1.toLowerCase().startsWith("0b")) {

			Integer number = convertBinarytoInteger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", num1);
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else if (num1.toLowerCase().startsWith("0x")) {

			Integer number = convertHexaToIneger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else if (num1.toLowerCase().startsWith("0")) {

			Integer number = convertOctalToInteger(num1);
			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", Integer.toOctalString(number));
			return conver;

		} else if (num1.matches("(\\\\+|-)?([.0-9]+)")) {

			Integer number;
			if (num1.contains(".")) {
				Double dn = convertStringToDecimal(num1);
				number = dn.intValue();
			} else {
				number = convertStringToInteger(num1);
			}

			conver.put("decimal", "" + number);
			conver.put("binary", "0b" + Integer.toBinaryString(number));
			conver.put("hexadecimal", "0X" + Integer.toHexString(number));
			conver.put("octal", "0" + Integer.toOctalString(number));
			return conver;

		} else {
			System.out.println("worng format!!!");
		}
		return conver;

	}

	@SuppressWarnings("unchecked")
	private <T extends Number> T divResult(T n1, T n2) {
		T result = null;

		
		try {
			if (n1 instanceof Double || n2 instanceof Double) {

				if (n2.doubleValue() == 0.0) {
					throw new ArithmeticException();
				}
				return (T) new Double(n1.doubleValue() / n2.doubleValue());
			} else {

				return (T) new Integer(n1.intValue() / n2.intValue());
			}
		} catch (ArithmeticException e) {
			System.out.println("can not divide by 0");
		}
		return result;

	}

	private Integer convertStringToInteger(String num) {
		return (Integer.parseInt(num.trim().intern()));

	}

	private Integer convertOctalToInteger(String num) {
		return (Integer.parseInt(num.substring(1, num.length()), 8));

	}

	private Integer convertHexaToIneger(String num) {
		return (Integer.parseInt(num.substring(2, num.length()), 16));

	}

	private Integer convertBinarytoInteger(String num) {
		return (Integer.parseInt(num.substring(2, num.length()), 2));

	}

	private double convertStringToDecimal(String num) {
		return (new BigDecimal(num).doubleValue());

	}

}
