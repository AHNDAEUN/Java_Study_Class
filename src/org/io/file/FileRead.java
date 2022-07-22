package org.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	
	public void read() throws Exception {
		// txt에 작성한 이름을 가져오려고함
		
		//파일의 내용 읽어오기
		//1.어느폴더의 어느파일이냐!
		
		File file =new File("C:\\Study","test.txt");
		
		// 파일을 읽어올(연결) 준비
		
		FileReader fr =new FileReader(file); //에러뜨는 이유는 파일이 없을수도 있기 때문에 
		
		//3. 파일의 내용을 읽어오려고 함 (내용 열기)
		//-파일의 내용 읽기 위한 보조 스트림 연결
		//fr.read(); // read한글자씩 읽어옴
		BufferedReader br =new BufferedReader(fr);//file -int를 문자열로 반환 
		
	//	4. 내용 읽기
		
		
	boolean check =true;	
	while(check) {
	String name = br.readLine(); // 엔터키를 만날때까지 읽어옴 , 커서가 한 줄 내려감 
								// 마지막 줄을 끝으로 아무것도 없으면 null(정말아무것도 없을때, 안내려갈때) 리턴, 첫 줄의 빈칸은 null이 아님 =공백으로 출력 
	if (name==null) {
		
		break;
	}		
	System.out.println(name);
	
	}
	}
}
