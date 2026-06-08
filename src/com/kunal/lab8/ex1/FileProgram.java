package com.kunal.lab8.ex1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("source.txt");
			
			FileWriter fw = new FileWriter("target.txt"); 
			
			CopyDataThread thread = new CopyDataThread(fr, fw); 
			
			thread.start();
		} catch (Exception e ) {
			
			System.out.println(e);
		}
	}
}
