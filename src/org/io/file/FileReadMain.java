package org.io.file;

import java.io.FileWriter;

public class FileReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileRead fr = new FileRead();
		FiileWrite fw =new FiileWrite();
		
		try {
			fr.read();
			fw.Write();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
