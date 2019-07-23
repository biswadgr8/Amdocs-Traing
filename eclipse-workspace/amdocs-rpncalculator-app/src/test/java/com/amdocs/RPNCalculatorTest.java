package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {

	@Test
	public void testSimpleAddition()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.evaluate("10 15 +");
		double expectedResult = 25.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
	
	@Test
	public void testSimpleSubtraction()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.evaluate("100 15 -");
		double expectedResult = 85.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
	@Test
	public void testSimpleMultiplication()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.evaluate("10 5 *");
		double expectedResult = 50.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
	@Test
	public void testSimpleDivison()
	{
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.evaluate("10 5 * 100 20 / -");
		double expectedResult = 45.0;
		assertEquals (expectedResult,actualResult,0.0001);
	}
}
