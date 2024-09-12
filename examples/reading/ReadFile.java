package com.xworkz.reading;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
	
		try {
            File file = new File("C:\\Users\\gunas\\eclipse-workspace\\principles\\satvic");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
