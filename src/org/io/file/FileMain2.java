package org.io.file;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) { 

		File file =new File("C:\\Study");
		String [] names =file.list(); 
		for (String s:names) {
			System.out.println(s);
			
		}
		
		
		File [] files = file.listFiles(); // 파일을 냅두고 폴더면지워라 
		for (File f: files) {
			
			//빈파일찾고 지우기
			if (f.isFile()) {
				
				if(f.length()==0){ 
					
					f.delete();
					
				}
			}
		}
			}

}
