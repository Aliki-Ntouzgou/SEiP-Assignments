package math;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import org.junit.Assert;

public class MyMathTest {
	
	MyMath mymath = new MyMath();
	
	/*
	 * Tests the factorial() method's exceptions cases using Rule testing
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_factorial_FirstException() {
		thrown.expect(IllegalArgumentException.class);
		mymath.factorial(-5);
	}
	
	@Test
	public void test_factorial_SecondException() {
		thrown.expect(IllegalArgumentException.class);
		mymath.factorial(15);
	}
	
	/*
	 * Tests the isPrime() method's exceptions cases using Rule testing
	 */
	@Test
	public void test_isPrimeExceptionExpected() {
		thrown.expect(IllegalArgumentException.class);
		mymath.isPrime(1);
	}
	
	@Test
	public void test_isPrimeFalse() {
		Assert.assertEquals(false, mymath.isPrime(12));
	}
	
	@Test
	public void test_isPrimeTrue() {
		Assert.assertEquals(true, mymath.isPrime(13));
	}
	
}

