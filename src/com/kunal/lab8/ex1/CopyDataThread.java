package com.kunal.lab8.ex1;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataThread extends Thread {

	FileReader fr; 
	FileWriter fw; 
	
	public CopyDataThread(FileReader fr , FileWriter fw) {
		this.fr = fr ; 
		this.fw = fw ;
		
	}
	
	@Override 
	
	public void run() {
		
		try {
			int ch ; 
			int count = 0 ; 
			
			while ((ch = fr.read())	!= -1 	) {
				
				fw.write(ch);
				count++ ;
				
				if(count == 10 ) {
					
					System.out.println("10 characters copied ");
				
				Thread.sleep(5000);
				
				count = 0 ;
				}
				
			}
			
			fw.close();
			fr.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
