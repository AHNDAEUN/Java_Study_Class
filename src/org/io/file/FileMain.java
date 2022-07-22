package org.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
	// file: 파일이나 폴더의 정보를 담는 클래스 
	//     :실제 파일이나 폴더가 없을수도 있음 / 없으면 없는 정보를 가지고 있음  
		//파일을 프로그램으로 연결 
		
		
		// 파일 위치 알려주기 -객체생성
		// 어디에 있는 어떤파일인지 경로를 생성자에 넣어야함 
				
      
		File file =new File(" C:\\Study\\test.txt"); //폴더명+파일명한꺼번에 넣음
	
      
      
 		file =new File("C:\\Study", "test.txt"); 
		// parent : 폴더 , child: 파일명 , 최종-폴더명

		//1. 폴더명 경로가 있는 file 객체 이용 
 			File path = new File("C:\\Study");
 			file = new File(path, "test.txt");
 		
 		
    System.out.println(file.exists()); // file 존재하는지 물어봄(true, false)
 	System.out.println(file.isFile());// 파일입니까?
 	System.out.println(file.isDirectory()); //디렉토리입니까?
 	System.out.println(file.length()); // 파일의 크기 (0= 내용이 없는 빈 파일)
 	
 	System.out.println("================================");
 	System.out.println(path.exists());
 	System.out.println(path.isFile());
 	System.out.println(path.isDirectory()); 
 	
 	file = new File("C:\\Study\\sub");// 확장자가 없으면 폴더 
 	if (file.exists()) {
 		file.mkdir();// 폴더를 만드세요 
 	}
 	
 	file = new File("C:\\Study\\sub2//t1");
 		//file.mkdir(); // 중간에 폴더가 없으면 생성이 안 됨
 		file.mkdirs();// 복수형 디렉토리들을 만드세요 
 		
 		File file2 = new File("C:\\Study\\sub2//t1");
 		file2.mkdirs();
 		
 		file.delete(); // 폴더를 지울땐 내부가 아무것도 없어야함
 		File file3 =new File ("C:\\Study\\sub2");
 	//	file.delete();// 파일 지우자 
 		file3.delete();
 		
	
}
}