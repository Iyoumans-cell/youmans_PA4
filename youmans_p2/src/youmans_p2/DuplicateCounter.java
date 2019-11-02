package youmans_p2;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Collections; 
import java.util.*;

public class DuplicateCounter {
	private Map<String,String> wordCounter = new HashMap<String,String>();  
	
	 
	  
	public void count(String dataFile) {   
		 ArrayList<String> wordList = new ArrayList<String>();
		try {
		 File input1 = new File(dataFile);  
		 FileReader reader1 = new FileReader(input1);
		 BufferedReader buff1 = new BufferedReader(reader1);  
		 
		 String text = "";
		 String line = "";  
		 
		 while (text != null) {
			 text = buff1.readLine();  
			 
			 if(text != null) {
			 line = text+" "+line;   
			 }
			 }  
			 reader1.close();  
			 buff1.close(); 
		 
		 text = "";
		 int countWords = 0;
		for(int i = 0;i<line.length();i++) { 
		if((Character.isLetter(line.charAt(i))) || (line.charAt(i) == '-')) { 
			text = text+Character.toString(line.charAt(i));
			}  
		else {  
			 
			wordList.add(text);
			text = ""; 
		 
		}  
		}
		wordList.add(text); 
		wordList.removeAll(Collections.singleton("")); 
		System.out.println(wordList);
		for(int w = 0;w<wordList.size();w++) {   
			 for(int y = 0;y<wordList.size();y++) {
				  
				  if(wordList.get(w).equals(wordList.get(y))) { 
					   countWords = countWords+1; 
					   
				  }  
				   
				 
				  wordCounter.put(wordList.get(w),Integer.toString(countWords));
				  
			 } 
			 
			 countWords = 0;
			 
		}
		 
		System.out.println(wordCounter);  
		reader1.close();  
		line = null;  
		text = null;
		buff1.close(); 
		wordList = null;
		
		}
			 
		catch (IOException e) { 
			System.out.println("Error: IOException has occured at count");
		}
	}
	
	public void write(String outputFile) { 
		try {
			File output = new File(outputFile); 
			PrintWriter writer = new PrintWriter(output);   
			writer.println("Unique words counter: "+ wordCounter);   
			writer.flush();
			writer.close();  
			wordCounter.clear();
		} 
		catch (IOException e) { 
			System.out.println("Error: IOException has occured at write");
		}
		 
	} 
}
