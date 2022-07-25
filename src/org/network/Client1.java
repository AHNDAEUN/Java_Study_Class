package org.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		
	// 상대방 서버로 보내기
	//접속하려는 ip port번호 
		Socket socket =new Socket("192.168.7.50", 8282); 
					//host -도메인 네임 (www.~)
		
		System.out.println(" Server 접속 완료 ");//점속은 한번하고 무한 
	//---------------- 
		
		 OutputStream os=null;
		
		 OutputStreamWriter ow= null;
		 BufferedWriter bw= null;
		 
		 InputStream is =null;
		 InputStreamReader ir= null;
		 BufferedReader br=null; 
		boolean check = true;
		
		//큐라는 메세지 시 서버 클라이언트 둘다 종료 
		
		while(check) { 
		System.out.println(" 서버로 보낼 메세지 입력");
		String message = sc.next();
	//	String message1 = sc.next();
		
	//	String message ="Hello server!!"; /// 메세지를 서버로 보내기 
	
		
	  os = socket.getOutputStream(); // 0,1로 처리
	  ow = new OutputStreamWriter(os); //Writer 문자 한글자 처리
	 	 bw =new BufferedWriter(ow);
	
	 	
	 	// 전송
	 	bw.write(message +"\r\n");
		 //	bw.write(message1 + "\r\n");
		 	bw.flush();
	 	
		 	if (message.toUpperCase().equals("Q")){ // 소문자or 대문자 
		 	}
		 	
		 	
		 	//-=============================================
	 	is = socket.getInputStream();//0과1로 처리
		 ir =new InputStreamReader(is);
		 br =new BufferedReader(ir);
		message = br.readLine();
		
		
		if( message.toLowerCase().equals("q")) {
		}
		
		
		System.out.println("Client: " +message);
	 		 	
		} //안에 있는 것들이 지역변수라서 밖에 선언해줘야함
		
		
		
	 	//자원해제 (연결된 역순)
	 	bw.close();
	 	ow.close();
	 	os.close();
	 	socket.close();
	 	
	}
}
