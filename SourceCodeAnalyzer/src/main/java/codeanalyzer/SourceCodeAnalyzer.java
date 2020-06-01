package codeanalyzer;

import java.io.IOException;

/**
 * @author Aliki Ntouzgou
 */
public interface SourceCodeAnalyzer {

	public int calculateCode(String filepath, String analyzerType) throws IOException;

}