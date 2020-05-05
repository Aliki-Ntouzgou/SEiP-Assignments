package math;

import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;
import io.FileIO;

public class ArrayOperationsTest {

	ArrayOperations arop = new ArrayOperations();
	
	/*
	 * Tests the findPrimesInFile() method using the Mockito features to mock the FileIO and MyMath instances 
	 * passed as parameters in the method
	 */
	@Test
	public void test_findPrimesInFile_Mocking() {
		//Mock the FileIO dependency
		FileIO fio = mock(FileIO.class);
		when(fio.readFile("filepath")).thenReturn(new int[] {13,17,12,16});
		
		//Mock the MyMath dependency
		MyMath mym = mock(MyMath.class);
		when(mym.isPrime(13)).thenReturn(true);
		when(mym.isPrime(17)).thenReturn(true);
		when(mym.isPrime(12)).thenReturn(false);
		when(mym.isPrime(16)).thenReturn(false);
	
		Assert.assertArrayEquals(new int[] {13,17}, arop.findPrimesInFile(fio, "filepath", mym));
	}
	
	/*
	 * Tests when the prime_integers array is empty and throws an exception
	 */
	@Test (expected = IllegalArgumentException.class)
	public void test_primeintegers_exception() {
		//Mock the FileIO dependency
		FileIO fio = mock(FileIO.class);
		when(fio.readFile("filepath")).thenReturn(new int[] {2,4,6,8});
		
		//Mock the MyMath dependency
		MyMath mym = mock(MyMath.class);
		when(mym.isPrime(2)).thenReturn(false);
		when(mym.isPrime(4)).thenReturn(false);
		when(mym.isPrime(6)).thenReturn(false);
		when(mym.isPrime(8)).thenReturn(false);
		
		arop.findPrimesInFile(fio, "filepath", mym);
	}

		
}


