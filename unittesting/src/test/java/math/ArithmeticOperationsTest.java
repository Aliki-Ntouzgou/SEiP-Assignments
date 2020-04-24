package math;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import org.junit.Assert;

public class ArithmeticOperationsTest {
	ArithmeticOperations arop = new ArithmeticOperations();
	
	/*
	 * Tests the division() method
	 */
	@Test
	public void test_division() {
		Assert.assertEquals(6.0, arop.divide(12,2), 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void test_division_exception() {
		arop.divide(12,0);
	}
	
	/*
	 * Tests the myltiply() method when it works successfully
	 */
	@Test
	public void test_multiply() {
		Assert.assertEquals(12, arop.multiply(6, 2), 0);
	}
	
	/*
	 * Tests the exceptions cases of the myltiply() method
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(0, 2);
	}
	
	@Test
	public void test_multiply_RuleExceptionSecond() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(2147483647, 2);
	}
	
	@Test
	public void test_multiply_RuleExceptionThird() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(8,0);
	}

}
