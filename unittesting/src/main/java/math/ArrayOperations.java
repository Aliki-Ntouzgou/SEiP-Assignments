package math;

import io.FileIO;

public class ArrayOperations {
	
	FileIO fileIo = new FileIO();
	MyMath mymath = new MyMath();
	int[] prime_integers = new int[6];
	
	/*
	 * Iterates in an array of numbers and returns a new array that contains only prime numbers
	 */
	int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] integers = fileIo.readFile(filepath);
		int i = 0;
		
		for (int integer:integers) {
			if (mymath.isPrime(integer) == true)
				prime_integers[i] = integer;
				i++;
		}
		return prime_integers;
		
	}

}
