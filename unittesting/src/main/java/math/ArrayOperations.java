package math;

import io.FileIO;
import java.util.ArrayList;

/**
* The ArrayOperations provides simple arithmetic operations
* that serve as hands-on practice on Unit Testing.
*
* @author  Aliki-Ntouzgou
* @since   March 2020
*/

public class ArrayOperations {
	
	MyMath mymath = new MyMath();
	
	/*
	 * Iterates in an array of numbers and returns a new array that contains only prime numbers
	 */
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] integers = fileIo.readFile(filepath);
		int k = 0;
		ArrayList <Integer> prime_integers = new ArrayList<>();
		
		for (int integer:integers) {
			if (mymath.isPrime(integer) == true)
				prime_integers.add(integers[k]);
				k++;
		}
		
		if (prime_integers.size() == 0) 
			throw new IllegalArgumentException("There were not found any prime integer numbers.");
		
		// Convert the List to an array 
		return prime_integers.stream().mapToInt(i -> i).toArray();
		
	}

}
