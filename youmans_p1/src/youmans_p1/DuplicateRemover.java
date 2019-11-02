package youmans_p1;
import java.io.*;
import java.util.*; 

public class DuplicateRemover {
	private HashSet<String> uniqueWords = new HashSet<String>();	 
	 
	public void remove(String dataFile) {  
		try {
	 File input = new File(dataFile);  
	 FileReader reader = new FileReader(input);
	 BufferedReader buff = new BufferedReader(reader);  
	 
	 String text = "";
	 String line = "";   
	 
	 while (text != null) {
	 text = buff.readLine();  
	 
	 if(text != null) {
	 line = text+" "+line;   
	 }
	 }  
	 reader.close();  
	 buff.close(); 
	 
	 text = "";
	 int countWords = 0;
	for(int i = 0;i<line.length();i++) { 
	if((Character.isLetter(line.charAt(i)))|| (line.charAt(i) == '-')) { 
		text = text+Character.toString(line.charAt(i));
		}  
	else {  
		uniqueWords.add(text);
		text = ""; 
	} 
	} 
	uniqueWords.add(text); 
	uniqueWords.removeAll(Collections.singleton(""));
	reader.close();  
	input = null; 
	line = null;  
	text = null;
	buff.close(); 
	countWords = 0;
		} 
		catch (IOException e) { 
			System.out.println("Error: IOException has occured at remove");
			
		}
	} 
	
public void write(String outputFile)	 {    
	try { 
		File output = new File(outputFile); 
	PrintWriter writer = new PrintWriter(output);   
	writer.println("Unique words: "+ uniqueWords);   
	writer.flush();
	writer.close(); 
	uniqueWords = null;
	} 
	catch (IOException e) {  
		System.out.println(e.getMessage());
		System.out.println("Error: IOException has occured at write");
} 
}
}	


 
