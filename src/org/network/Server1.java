package org.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	
	public void receive() throws Exception {
	
		ServerSocket serversocket =new ServerSocket(8282); // 서버라서 특정포트번호가 필요함, 임의로 서버번호를 지정해서 이 부분은 ()의 번호로 쓰겠다 
		
		// 서버를 오픈하고 Client의 접속을 기다림
		
		System.out.println("Client의 접속을 기다리는중 ");
		
		//Socket : 상대방과 1:1 통신 
		
		Socket socket =serversocket.accept();
		
		InputStream is = socket.getInputStream();//0과1로 처리
		InputStreamReader ir =new InputStreamReader(is);
		BufferedReader br =new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("Client: " +message);
			
		br.close();
				
		ir.close();
		
		is.close();
		
		socket.close();
		serversocket.close();
		
		
		System.out.println("Client와 접속 완료");
		
	}
}
