package org.lang.list_ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	//WeatherController  
	//
	//start라는 메서드 하나 있음
	//1번 누르면 날씨정보 초기화 - 호출(실행)= init메서드 호출 
	//2번 누르면 전국날씨 출력 
	//3번 누르면 지역날씨 검색 - find 출력
	//4번 (add) 지역정보 추가 
	//5번 지역정보 삭제 = 해당정보 삭제 없으면 "없는 지역입니다." 메세지 노출
	//6번 프로그램 종료 6번 누를때까지 메세지 반복 
	
	private WeatherService ws;
	private Scanner sc;
	private WeatherView wv;
	
	
	//결합도가 강하다(높다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입	
	//                   : 생성자의 매개변수, 
	
	
	public WeatherController() {
		//ws =new WeatherService(); //내가 사용해야 하는 (의존하는) 메서드를 직접 선언할 수 있음
		
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		this.sc = new Scanner(System.in);
		
	}
	
	public void start() {
		
		
		ArrayList<CityDTO> ar = new ArrayList<>(); 
			boolean check = true;
			
			while (check) {
				
				System.out.println("1. 날씨 초기화");
				System.out.println("2. 날씨 정보출력");
				System.out.println("3. 지역날씨출력");
				System.out.println("4. 지역정보추가");
				System.out.println("5. 지역정보삭제");
				System.out.println("6. 종     료");
				
				int select =sc.nextInt();
				
				if (select==1 ) {
					
				   ws.init(ar); // 초기화 하자
				} else if (select==2 ){
				
					wv.view(ar);
				}else if (select==3 ){
					
					// 1. 지역찾기 - 출력 return
					 CityDTO cityDTO = ws.find(ar);
					 if(cityDTO != null) {
						wv.view(cityDTO);
						 
					 }else {
						 wv.view(" 잘못된 도시명 ");
					 }
					 
					}else if (select==4 ){
						
						boolean result = ws.add(ar);
						String message="추가실패";
						if (result){//result 자체가 투르펄스임
						message ="추가 성공";	
						
						} 
						
						wv.view(message);

					}else if (select==5 ){
						boolean result = ws.remove(ar);
						String message="삭제 실패";
						if(result) {
							message="삭제 성공";
						}
						wv.view(message);	
						
						//ws.remove(ar);
						// 나는 추가적으로 삭제가 되었는지 알고 싶음 => weatherservice(boolean타입 생성)
						
					}else {
						
						check=!check;
						break;
						
						
					}
				}
				
			}
	
	
	}
	

