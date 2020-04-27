package math;

/**
* The MyMathOperations provides simple arithmetic operations
* that serve as hands-on practice on Unit Testing.
*
* @author  Aliki-Ntouzgou
* @since   March 2020
*/

public class MyMath {
	
	/*
	 * Returns the factorial of an integer
	 */
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
	
	/*
	 * Returns true if an integer is a prime number
	 */
	public boolean isPrime(int n) {
		if (n < 2)
			throw new IllegalArgumentException("n should be >=2");
		else if (n % 2 == 0 )
			return false;
		else 
			for (int i = 3; i*i<=n; i+=2) {
				if ( n%i == 0 )
					return false;
			}
		return true;
	}
	
}

