package math;

public class MyMath {

	public int factorial(int n) {
		if (n == 0)
			return 1;
		else if (n < 0 ) {
			throw new IllegalArgumentException("n should be >0");
		}
		else if (n > 12) {
			throw new IllegalArgumentException("n should be <=12");
		}
		else
			return (n*factorial(n-1));
	}
	
}
