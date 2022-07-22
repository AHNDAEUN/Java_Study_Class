package org.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain1 {

	public static void main(String[] args) {
		// 키보드로부터 글자를 입력받는 순서 작성
		
		InputStream is = System.in; // 키보드와 전선이 연결, byte처리
													//①키보드에 입력받을 것을 
		//byte처리를 모아서 글자를 만듬
		InputStreamReader ir =new InputStreamReader(is);// ②글자로 모아두고  
		//글자를 처리하면서 추상클래스
		
		//키보드와 연결해서 준비하는 과정 -------------↑
	
		BufferedReader br =new BufferedReader(ir); //③버퍼에 저장
		//키보드와 연결해서 끝-------------↑
	
		try {
			System.out.println("키보드에서 입력 후 엔터칠때까지 움직일 수 있어");
			String msg = br.readLine(); // 한줄을 읽어오세요
	}	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  
	}  		//지역변수는 초기화를 하지 않으면 쓸 수 없다 
			 // System.out.println(msg);
	}

}
