package codeanalyzer;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Analyzes the contents of a Java source code file 
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes using the Regex comparison.
 * @author Aliki Ntouzgou
 *
 */
public class RegexAnalyzer implements SourceCodeAnalyzer {
	
	public int calculateCode(String filepath, String analyzerType) throws IOException {
		
			//this should not be here I just havent find the way yet how
			String sourceCode = fileReader.readFileIntoString(filepath);
			
			int nonCodeLinesCounter = 0;
			int nom = 0;
			int noc = 0;
			
	        //calculates the LOC
	        if (Pattern.matches("((//.*)|(/\\*.*)|(\\*+.*))", sourceCode)) {
	        	nonCodeLinesCounter++;
	        	int sourceFileLength = sourceCode.split("\n").length;
	        	int loc = sourceFileLength - nonCodeLinesCounter;
	        	
	        	return loc;
	        }

	        //calculates the NOM
	        if (Pattern.matches(".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*", sourceCode)) {
	       		nom++;
	       	
	       	return nom;
	       }
	        
	       //calculates the NOC
	        if (Pattern.matches(".*\\s*class\\s+.*", sourceCode)) {
	        	noc++;
	        	
			return noc;
	        }
	        
	}
	
}