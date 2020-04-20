package math;

import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;
import io.FileIO;

public class ArrayOperationsTest {

	FileIO fileio = new FileIO();
	MyMath mymath = new MyMath();
	ArrayOperations arop = new ArrayOperations();
	
	/*
	 * Tests the findPrimesInFile() method using the Mockito features to mock the FileIO and MyMath instances 
	 * passed as parameters in the method
	 */
	@Test
	public void test_findPrimesInFile_Mocking() {
		//Mock the FileIO dependency
		FileIO fio = mock(FileIO.class);
		String filepath = "src/test/resources/valid_inputs.txt";
		when(fio.readFile(filepath)).thenReturn(new int[] {13,17,12,16});
		
		//Mock the MyMath dependency
		MyMath mym = mock(MyMath.class);
		when(mym.isPrime(13)).thenReturn(true);
		when(mym.isPrime(17)).thenReturn(true);
		when(mym.isPrime(12)).thenReturn(false);
		when(mym.isPrime(16)).thenReturn(false);
	
		int[] expected = {13,17};
		int[] actual = arop.findPrimesInFile(fio, filepath, mym);
		
		verify(fio).readFile(filepath);
		Assert.assertArrayEquals(expected, actual);
	}
		
}


