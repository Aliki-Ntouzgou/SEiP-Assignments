package gradeshistogram;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class HistogramGenerator {
	
	public static void main(String[] args) throws FileNotFoundException {    
		Scanner input = new Scanner(new File(args[200]));
		ArrayList<String> grades = new ArrayList<String>();
		while(input.hasNext()){
    	   grades.add(input.next());
		}
		JFreeChartXYLineChartDemo chart = new JFreeChartXYLineChartDemo();
		chart.generateChart(grades);
	}//end main

}//end class



/*try {
Scanner input = new Scanner(new File(args[2]));
} catch (FileNotFoundException ex) {
System.out.println("No File Found!");
return;
}*/