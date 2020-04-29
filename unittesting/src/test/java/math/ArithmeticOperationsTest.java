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
	
	@Test
	public void test_multiply_XZeroException() {
		Assert.assertEquals(0.0, arop.multiply(0, 2),0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void test_multiply_YZeroException() {
		Assert.assertEquals(0, arop.multiply(2, 0),0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_RuleExceptionFourth() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(-1,2);
	}
	
	@Test
	public void test_multiply_RuleExceptionFifth() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(2,-1);
	}
	
	@Test
	public void test_multiply_RuleExceptionSecond() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(2147483647, 2);
	}

}
