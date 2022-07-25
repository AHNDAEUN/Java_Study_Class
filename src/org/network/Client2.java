package org.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Client2 {

	
	
	//메서드 이름 : getFood
	// 서버와 접속후 메세지를 뿌려줌
	//1. 점심메뉴
	// 2. 저녁메뉴
	//3. 종료
	
	// 번호를 입력받아서 서버로 전송 
	
	// 2.을 입력해서 엔터치면 저녁메뉴 중 하나가 옴 ==> 무슨메뉴가 왔는지 받아서 출력 
	//3번 누를때까지 무한 반복 
	
	
	
	 public void getFood()  throws Exception{
		  
		 
		 Socket socket =new Socket("192.168.7.60",8282);
		 Scanner sc = new Scanner (System.in);
		 
		 
		 OutputStream os=null;
			
		 OutputStreamWriter ow= null;
		 BufferedWriter bw= null;
		 
		 InputStream is =null;
		 InputStreamReader ir= null;
		 BufferedReader br=null; 
		 
		 
		 
		 boolean check =true;
		 
		 while (check) {
			 System.out.println("1. 점심메뉴");
			 System.out.println("2. 저녁메뉴");
			 System.out.println("3. 종   료");
			 int select = sc.nextInt();
			 
			 // select로 받은 것을 socket으로 보냄 
			 
			 os= socket.getOutputStream();
			 ow =new OutputStreamWriter(os);
			 bw = new BufferedWriter(ow);
			 
			 bw.write(select +"\r\n");
			 bw.flush();
			 
			 // 메세지를 보내고 종료 시키기
			 	if (select==3) {
			 		break;
			 	}
			 
			 //================================================
			 
			 
			//외부에서 내쪽으로 받아
			 is = socket.getInputStream();
			 ir= new InputStreamReader(is);
			 br =new BufferedReader(ir);
			 
			 String message = br.readLine();
			 System.out.println(message);
			 
			
			 
			 
		 }
		 
			
		 	//자원해제 (연결된 역순)
		 	bw.close();
		 	ow.close();
		 	os.close();
		 	socket.close(); 
		 	
		 	bw.close();
		 	ow.close();
		 	os.close();
		 	socket.close();
	 }
}
