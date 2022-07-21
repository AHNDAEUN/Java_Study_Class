package org.lang.list_ex1;

import java.util.ArrayList;

public class WeatherView {

	//WeatherView
	//
	//view
	//리스트를 받아서 모든정보를 꺼내서 출력
	//view 또 다른 뷰인데 메서드는 똑같음
	//city 하나를 받아서 모든 정보를 출력 
	//view 
	//메세지 (string 타입 1개) 하나를 받아서 출력
	
	//void=> 되돌려줄것 없음 return x , 
	public void view(String message) {//1)
		System.out.println(message);
		
	}

	public void view(CityDTO cityDTO) {//2)
		System.out.println(cityDTO.getName());
		System.out.println(cityDTO.getGion());
		System.out.println(cityDTO.getHum());
		System.out.println(cityDTO.getStatus());
		
	}
	
	public void view(ArrayList<CityDTO> ar) {//3  <E>타입보증
	
		for (int i=0; i<ar.size();i++) { //ArrayList 사이즈 만큼
			CityDTO cityDTO =ar.get(i);   //ar를 꺼냈을때 CityDTO가 나옴 CityDTO안에 내용물이 있음 
										// get- 꺼내오자 	
										// ar을 꺼내오면 CityDTO가 들어있으니까 리턴 타입도 CityDTO
			this.view(cityDTO);		//  위처럼 프린트물을 쓰고 싶을때 두번 쓰지 말고 메서드 내에서 또다른 메서드 호출
		
		}
}
}