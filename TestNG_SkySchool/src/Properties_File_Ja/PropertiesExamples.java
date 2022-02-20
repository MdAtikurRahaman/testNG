package Properties_File_Ja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExamples {
	
	static FileInputStream fis;
	static Properties myProperties;

	public static void main(String[] args) throws IOException  {
		//How to create Properties File: File->New->Others->General->File->File Name
		
		//Here we load this file as a Text  in fis variable
		fis = new FileInputStream("C:\\Java21Jan\\workspace\\class_20_PropertiesFiles\\src\\class_20_PropertiesFiles\\myfile.properties");
		
		myProperties = new Properties();
		
		//here we convert this fis Text     to      Property values 
		myProperties.load(fis);
		
		System.out.println( myProperties.getProperty("name") );
		System.out.println( myProperties.getProperty("age") );
		
		System.out.println( myProperties.size() );
			
	}//main

}//class
