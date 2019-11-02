package youmans_p2;
import java.util.*; 
import java.io.*;
public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateCounter duplicateCounter = new DuplicateCounter();   
	    String dataFile = "C:\\Users\\Ian\\Documents\\problem2.txt";     
	    String outputFile = "C:\\Users\\Ian\\eclipse-workspace\\youmans_p2\\src\\youmans_p2\\unique_word_counts.txt"; 
	     duplicateCounter.count(dataFile); 
	     duplicateCounter.write(outputFile);
		 

	}

}
