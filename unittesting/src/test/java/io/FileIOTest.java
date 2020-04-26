package io;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class FileIOTest {	
	FileIO fio = new FileIO();
	String resourcesPath = "src/test/resources/";
	
	/*
	 * Tests the readFile() method when it works successfully
	 */
	@Test
	public void test_readFile() {
		int[] example_integers = new int[] {1,2,3,4,5,6};
	
		String filepath = resourcesPath + "example_integers.txt";
	
		Assert.assertArrayEquals(example_integers, fio.readFile(filepath));
		
	}
	
	/*
	 * Test the exceptions cases of the readFile() method
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_readFile_RuleException() {
		String resourcesPath = "src/test/resources/";
		String filepath = resourcesPath + "no_existent_file.txt";
		
		thrown.expect(IllegalArgumentException.class);
		fio.readFile(filepath);
	}
	
	@Test
	public void test_readFile_SecondRuleException() {
		String resourcesPath = "src/test/resources/";
		String filepath = resourcesPath + "empty_file.txt";
		
		thrown.expect(IllegalArgumentException.class);
		fio.readFile(filepath);
	}
	
	@Test
	public void test_readFile_ThirdRuleException() {
		String resourcesPath = "src/test/resources/";
		String filepath = resourcesPath + "invalid_entries.txt";
		
		thrown.expect(NumberFormatException.class);
		fio.readFile(filepath);
	}
	
	/*
	 * Tests the readFile() method with invalid entries
	 */
	public void testReadFileContainsInvalidEntries() {
		int[] expected = new int[] {1,2,3,4,5,6};
		String resourcesPath = "src/test/resources/";
		String filepath1 = resourcesPath + "invalid_entries.txt";
		
		Assert.assertEquals(expected, filepath1);	
	}
	
}
