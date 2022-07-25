package org.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	
	public void receive() throws Exception {
	
		Scanner sc = new Scanner(System.in);
		ServerSocket serversocket =new ServerSocket(8282); // 서버라서 특정포트번호가 필요함, 임의로 서버번호를 지정해서 이 부분은 ()의 번호로 쓰겠다 
		
		// 서버를 오픈하고 Client의 접속을 기다림
		
		System.out.println("Client의 접속을 기다리는중 ");
		
		//Socket : 상대방과 1:1 통신 
		
		Socket socket =serversocket.accept();
		System.out.println("Client 접속 완료");

		
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		
		
		boolean check = true;
		while(check) { 

		 is = socket.getInputStream();//0과1로 처리
		 ir =new InputStreamReader(is);
		 br =new BufferedReader(ir);
		String message = br.readLine();
		
		
		if (message.toUpperCase().equals("Q")) {
		  break;	
		}
		
		System.out.println("Client: " +message);
		
		
		
		//================================================
		
		 os = socket.getOutputStream();//0,1
		 ow = new OutputStreamWriter(os);//문자
		 bw = new BufferedWriter(ow);
		System.out.println("클라이언트로 보낼 메세지 입력");
		message = sc.next();
		
		
		//전송
		bw.write(message+"\r\n");
		bw.flush();
			
		if(message.toUpperCase().equals("Q")) {
			break;
		
		}
		
	}
	br.close();
	ir.close();
	is.close();
	
	bw.close();
	ow.close();
	os.close();
	
	socket.close();
	serversocket.close();
	
}
	}

