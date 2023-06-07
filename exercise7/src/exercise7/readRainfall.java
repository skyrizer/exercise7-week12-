package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readRainfall {

	   public static void main(String[] args) {
		   
	        try {
	        	
	            FileReader fileReader = new FileReader("data.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	            bufferedReader.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
