package org.lang.list_ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.lang.String.ex1.WorkerDTO;
import org.object1.ex1.Student;

public class WeatherService {
	
	//WeatherService
	//init 메서드 
	//sb에 있는 데이터들을 파싱해서 citydto에 담아서 리턴
	//어레이리스트에 담아서 리턴

	//add 메서드 
	//=city정보를 입력받아서 기존에 정보에 추가
	//도시명 기온 습도 현재상태를 dto에 받아서 리스트에 추가 



	//remove 메서드
	//도시명을 입력받아서 리스트에서 삭제 

	//find 메서드
	//도시명을 입력받아서 리스트에서 검색 리턴
	private StringBuffer sb;
	
	
	public WeatherService() {
		
		sb= new StringBuffer();
		sb.append("seoul, 30.2, 70%, 맑음,");
		sb.append("Daegu- 38.9- 90%- 흐림-");
		sb.append("jeju, 12.1, 10, 눈,");
		sb.append("busan, -0.5, 85, 태풍");
	
	}
	
			public void init (ArrayList<CityDTO> ar) {
					String info =sb.toString(); // sb를 담은 주소를 문자열로 반환
					String newinfo = info.replace("-", ","); // 바꿀 것 
					StringTokenizer st = new StringTokenizer (newinfo,"-");
					
					
						CityDTO cityDTO = new CityDTO ();
						
						
						
					
			}
		
		
				public void add(ArrayList<CityDTO> ar) {
		
					//add 메서드 
					//=city정보를 입력받아서 기존에 정보에 추가
					//도시명 기온 습도 현재상태를 dto에 받아서 리스트에 추가 

					//1.ArrayList <CityDTO> 받아와서 추가
					
					CityDTO cityDTO = new CityDTO();
					cityDTO.setName("test");
					cityDTO.setGion(20.3);
					cityDTO.setHum(80);
					cityDTO.setStatus("rain");
					
					ar.add(cityDTO); // 받아온 주소엔 추가된 내용은 넣으면됨 
					
	}
	
				public void remove() {
					//remove 메서드
					//도시명을 입력받아서 리스트에서 삭제 

		
	}

				public void find(ArrayList<CityDTO> ar) {
	
					//find 메서드
					//도시명을 입력받아서 리스트에서 검색 리턴
						
						System.out.println(" 도시명을 입력하시오 ");
						int city =sc.nextInt(); 
							
						for (int i=0; i<; i++) {   
							
							if() {
								
								
								break;
								
							}
								
						}
									return city;	 //찾으면 student 못찾으면 null		
						 
				}
				
				
				}
	
}








