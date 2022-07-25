package org.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javax.swing.DefaultRowSorter;

public class Server2 {

			//getFood
				//서버에서 메세지를 기다림 
		// 1. : 점심 메뉴 중에서 랜덤하게 하나를 골라서 클라이언트로 리턴
	//2. 저녁 메뉴 중 랜덤하게 하나를 골라서 클라이언트로 전송
	//3. 프로그램 종료 
	//그외 나머지 : 잘못 입력된 번호입니다.를 클라이언트로 전송 
	
	
	
	private ArrayList<String> lunch; //메뉴를 모을꺼임
	private ArrayList<String> dinner;
	
	
	 public Server2(){//생성자
	 
		 lunch = new ArrayList();
		 dinner =new ArrayList();
		 
		 lunch.add("짜장면");
		 lunch.add("햄버거");
		 lunch.add("피자");
		 lunch.add("라면");
		 lunch.add("오늘은 다이어트 안먹어");
	 
		 dinner.add("삼겹살");
		 dinner.add("치킨");
		 dinner.add("샐러드");
		 dinner.add("볶음밥");
		 dinner.add("물");
	 }
	 
		 // 위에 메뉴를 꺼내기 위해서 런치 . 겟 +인덱스 번호 
		// 랜덤으로 0~5번 인덱스까지 뽑음 
		 public void getFood() throws Exception {

			 ServerSocket serverSocket =new ServerSocket(8282);
			 // 열어두고 기다리는 상태에서 1:1 할 수 있는 서버 소켓을 만들어줌 
	
				Socket socket = serverSocket.accept();
				
				 OutputStream os=null;
					
				 OutputStreamWriter ow= null;
				 BufferedWriter bw= null;
				 
				 InputStream is =null;
				 InputStreamReader ir= null;
				 BufferedReader br=null; 
				 
				 
				boolean check = true; //===  3번이 나올때까지 무한반복 
				while (check) {
					
					// 서버가 클라이언트에서 받아서 메뉴를 전송해야함 
					
				
				 is = socket.getInputStream();
				 ir = new InputStreamReader(is);
				 br =new BufferedReader(ir);
				
				String message =  br.readLine(); // 랜선을 통해 지나가는 것들(숫자, 문자) 은 String으로 받음 
												
				int select = Integer.parseInt(message); // String으로 받고나서 숫자로 바꾸는 것 
				
				Random random =new Random(Calendar.getInstance().getTimeInMillis());// 현재 시간 객체를 가져와서 getTimeInMillis를 가져와
				// 그냥 랜덤을 실행하면 가짜 숫자를가지고옴 진짜 숫자를 사용하기 위해선  현재시간을 가져와야 하는데 Random(long seed) 호출하여 객체를 만들때 현재시간을 가져와서 만들자 

				//if (message.equals("1")) {
				if (select==1) {
					
					int index =random.nextInt(lunch.size());
							
						message = lunch.get(index);	// 최종 결과물(런치에 담아진 인덱스 번호) 을 메세지에 담을꺼야 
				}else if (select ==2) {
					
					int index = random.nextInt(dinner.size());
									// 메뉴가 안바뀌고 숫자만 바꾸는 방법 . size()
					message = dinner.get(index);	
				}else if (select ==3) {
					
					break;
				}else {
					message = " 잘못된 번호입니다. ";
					
					
				}
				
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				
				bw.write(message+"\r\n");
				bw.flush();
				
	 }// while의 끝
		 
				br.close();
				ir.close();
				is.close();
				
				bw.close();
				ow.close();
				os.close();
				
				socket.close();
				serverSocket.close();			
	 }

}