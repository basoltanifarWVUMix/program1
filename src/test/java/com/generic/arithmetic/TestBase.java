package com.generic.arithmetic;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;

public abstract class TestBase {
	
	
	@Rule
	public final TestRule rule=new TestWatcher() {
		
	};
	public Arithmetic getArithmetic() {
		return (new Arithmetic());
	}
	

}
