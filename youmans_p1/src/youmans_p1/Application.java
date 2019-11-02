package youmans_p1;
import java.io.*;   
import java.util.*;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		DuplicateRemover duplicateRemover = new DuplicateRemover();    
		String dataFile = "C:\\Users\\Ian\\eclipse-workspace\\youmans_p1\\src\\youmans_p1\\problem1.txt";  
		String outputFile = "C:\\Users\\Ian\\eclipse-workspace\\youmans_p1\\src\\youmans_p1\\unique_words.txt";
		duplicateRemover.remove(dataFile);
		duplicateRemover.write(outputFile);
	}
	}


