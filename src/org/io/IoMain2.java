package org.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		Scanner sc = new Scanner(System.in); //컴퓨터-키보드 0,1의 신호로 연결
//		
//		// 다 썼으면 다른사람이 쓸 수 있게 연결된 것을 끊어줘야함 
//	
//		sc.close(); // 서비스 연결 해제
	
			InputStream is = System.in;// 키보드와 연결, 0,1을 사용
			InputStreamReader ir = new  InputStreamReader (is);
			//입력받은 애 중에 글자를 처리하는 애 
			BufferedReader br =new  BufferedReader(ir);
			//글자를 모아 문자열로 반환
	//==================키보드 연결 끝===================
			System.out.println(" 입력 ");
			
			try {
				String message = br.readLine(); //br에서 한 줄 가져오세요.
				System.out.println(message); 
				//프린트문이 나왔다는 것은 Exception이 발생하지 않았다
			} catch (Exception e) {
			 e.printStackTrace(); // 어떤 오류인지 출력 
				
			} finally { // 예외가 발생하든 안하든 연결을 끊어줘야함
				//끊어줄땐 연결된 역순으로 자원 해제
				try {
				
				br.close(); //빨간줄은 Exception을 발생할 여지가 있다=> 다시 try-catch로 묶어줌
				ir.close();
				is.close();
				
				}catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
	}

}
