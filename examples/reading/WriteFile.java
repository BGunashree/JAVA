package com.xworkz.reading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) {
		
		 String name = "Gunashree B";
		 String email="gunashreebayanna@gmail.com";
		 long number=8951144517l;

		 String filePath = "C:\\Users\\gunas\\eclipse-workspace\\principles\\biodata";

	        
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
	            // Writing name, email, and number into the file
	            writer.write("Name: " + name);
	            writer.newLine(); // To add a newline
	            writer.write("Email: " + email);
	            writer.newLine(); // To add a newline
	            writer.write("Number: " + number);
	            writer.newLine(); // To add a newline
	            writer.newLine(); // Extra new line for separation

	      
	        } catch (IOException e) {
	            
	            System.err.println("An error occurred: " + e.getMessage());
	        }

	}

}
