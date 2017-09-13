package com.generic.arithmetic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   GeneralDivisionTest.class,
   GenericAdditionTest.class,
   GenericSubtractionTest.class,
   GenericMultiplicationTest.class,
   GenericPowerTest.class,
   GenericSqrtTest.class,
   NumberConvertorTest.class
})

public class JunitTestSuite {   
}  	