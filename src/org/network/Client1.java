package org.network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		
	// 상대방 서버로 보내기
	//접속하려는 ip port번호 
		Socket socket =new Socket("192.168.7.60", 8282); 
					//host -도메인 네임 (www.~)
		
		System.out.println(" Server 접속 완료 ");
	
		System.out.println(" 서버로 보낼 메세지 입력");
		String message = sc.next();
		
	//	String message ="Hello server!!"; /// 메세지를 서버로 보내기 
	
	 OutputStream os = socket.getOutputStream(); // 0,1로 처리
	 OutputStreamWriter ow = new OutputStreamWriter(os); //Writer 문자 한글자 처리
	 	BufferedWriter bw =new BufferedWriter(ow);
	 	
	 	// 전송
	 	bw.write(message +"\r\n");
	 	bw.flush();
	 	
	 	//자원해제 (연결된 역순)
	 	bw.close();
	 	ow.close();
	 	os.close();
	 	socket.close();
	 	
	}
}
