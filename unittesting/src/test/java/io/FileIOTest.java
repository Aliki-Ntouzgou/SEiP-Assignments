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
	
	/*
	 * Tests the readFile() method with invalid entries
	 */
	@Test
	public void testReadFileContainsInvalidEntries() {
		String resourcesPath = "src/test/resources/";
		String filepath = resourcesPath + "other_format.txt";
		
		thrown.expect(IllegalArgumentException.class);
		fio.readFile(filepath);
	}
}
