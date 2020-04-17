package math;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import org.junit.Assert;

public class ArithmeticOperationsTest {
	ArithmeticOperations arop = new ArithmeticOperations();
	
	@Test
	public void test_division() {
		Assert.assertEquals(6.0, arop.divide(12,2), 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void test_division_exception() {
		arop.divide(12,0);
	}
	
	@Test
	public void test_multiply() {
		Assert.assertEquals(12, arop.multiply(6, 2), 0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(0, 2);
		thrown.expect(IllegalArgumentException.class);
		arop.multiply(2147483647, 2);
	}

}
