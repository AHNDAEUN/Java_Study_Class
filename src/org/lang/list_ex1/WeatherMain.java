package org.lang.list_ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//1.클래스의 역할과 메서드의 역할, 변수의 역할
		
		//weathermain =프로그램 실행, test
		//weatherservice = 데이터 가공 , 로직 만들기 서비스에서 ->뷰 x
		//weathercontroller = 감독관리 누구를 호출하고 누구에게 일을 주는지 역할을 나눔 
		//weatherview = 받아온 정보를 출력 읽기전용 
		//cityDTO =데이터를 담고 있는 박스 (가방)
		
		
		//view 메서드를 확인하려면 객체 생성
		WeatherView wv = new WeatherView(); //1. test
		WeatherService ws = new WeatherService();
		//	wv.view("wv test");
		
		CityDTO cityDTO =new CityDTO(); //2. test
		cityDTO.setName("m");
		cityDTO.setGion(3.4);
		cityDTO.setHum(80);
		cityDTO.setStatus("맑음");
		
		
		CityDTO cityDTO2 =new CityDTO();//2. test
		cityDTO2.setName("ms");
		cityDTO2.setGion(17);
		cityDTO2.setHum(90);
		cityDTO2.setStatus("눈");
			
		
		//3. test
		ArrayList<CityDTO> ar =new ArrayList<>(); //여러개를 하나의 변수에 담으려고 함 인덱스가 아니라 메서드를 짚어넣음
 		ar.add(cityDTO);
 		ar.add(cityDTO2);
 		
// 		WeatherService test
// 		ws.add(ar);
 		
				wv.view(ar);
	}

}
