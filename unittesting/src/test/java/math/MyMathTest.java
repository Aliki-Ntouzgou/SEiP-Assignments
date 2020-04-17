package math;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class MyMathTest {
	
	MyMath mymath = new MyMath();
	
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
	
}

