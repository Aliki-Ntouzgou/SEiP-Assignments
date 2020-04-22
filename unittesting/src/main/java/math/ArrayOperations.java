package math;

import io.FileIO;
import java.util.ArrayList;

public class ArrayOperations {
	
	FileIO fileIo = new FileIO();
	MyMath mymath = new MyMath();
	
	/*
	 * Iterates in an array of numbers and returns a new array that contains only prime numbers
	 */
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] integers = fileIo.readFile(filepath);
		int i = 0;
		ArrayList <Integer> prime_integers = new ArrayList<>();
		
		for (int integer:integers) {
			if (mymath.isPrime(integer) == true)
				prime_integers.add(integers[i]);
				i++;
		}
		int[] primes_converted = new int[prime_integers.size()];
			int count = 0;
			for (Integer n: prime_integers) {
				primes_converted[count++] = n.intValue();
			}
		return primes_converted;
		
	}

}
