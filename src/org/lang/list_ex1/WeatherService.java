package org.lang.list_ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


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
	private Scanner sc;
	public WeatherService() {
		
		sb= new StringBuffer();
		sc= new Scanner(System.in);
		
		sb.append("seoul, 30.2, 70%, 맑음,");
		sb.append("Daegu- 38.9- 90%- 흐림-");
		sb.append("jeju, 12.1, 10, 눈,");
		sb.append("busan, -0.5, 85, 태풍");
	
	}
	
			public void init (ArrayList<CityDTO> ar) {
					String data =sb.toString(); // sb를 담은 주소를 문자열로 반환
			
					
					System.out.println(data);
					data = data.replace("-", ","); // 바꿀 것 
					
					StringTokenizer st = new StringTokenizer (data,",");
					
					while (st.hasMoreTokens()) {
			
						
						CityDTO cityDTO = new CityDTO ();
						cityDTO.setName(st.nextToken());
						cityDTO.setGion(Double.parseDouble(st.nextToken())); //parseDouble -문자열을 더블타입으로 변환
						cityDTO.setHum(Integer.parseInt(st.nextToken()));
						cityDTO.setStatus(st.nextToken());
						ar.add(cityDTO);
						
						
					}
					
			}
		
		
				public boolean add(ArrayList<CityDTO> ar) {
		
					//add 메서드 
					//=city정보를 입력받아서 기존에 정보에 추가
					//도시명 기온 습도 현재상태를 dto에 받아서 리스트에 추가 

					//1.ArrayList <CityDTO> 받아와서 추가
					
//					CityDTO cityDTO = new CityDTO();
//					cityDTO.setName("test");
//					cityDTO.setGion(20.3);
//					cityDTO.setHum(80);
//					cityDTO.setStatus("rain");
					
//					ar.add(cityDTO); // 받아온 주소엔 추가된 내용은 넣으면됨 
					
					CityDTO cityDTO = new CityDTO();
					
					System.out.println("도시명 입력");
					cityDTO.setName(sc.next());
					System.out.println("기온 입력");
					cityDTO.setGion(sc.nextDouble());
					System.out.println("습도 입력");
					cityDTO.setHum(sc.nextInt());
					System.out.println("날씨 입력");
					cityDTO.setStatus(sc.next());
					return ar.add(cityDTO);
					
					
				} //add 끝 
	
				public boolean remove(ArrayList<CityDTO> ar) {
					//remove 메서드
					//도시명을 입력받아서 리스트에서 삭제 
						System.out.println("삭제 하려는 도시명 입력");
						String name = sc.next().toUpperCase(); // 넥스트를 입력하는 문자열을 대문자로 만들면서 데이터를 집어 넣음
						boolean r =false;
						
						//전통 for
						
						
						for(int i=0;i<ar.size();i++) {
							if(name.equals(ar.get(i).getName().toUpperCase())) { //CityDTO의 이름을 꺼내와
								ar.remove(i);
								r= !r;
								break;
							}
						}
						return r;
							
							
							// 향상된 for문  ,인덱스번호가 아닌 메서드를 사용
//						for(CityDTO cityDTO: ar) {
//							if(name.equals(cityDTO.getName())) {
//								ar.remove(cityDTO);
//								break;
//							}
								
//							}
							
							
	}
						

				public CityDTO find(ArrayList<CityDTO> ar) {
	
					//find 메서드
					//도시명을 입력받아서 리스트에서 검색 리턴
						
//					CityDTO cityDTO =null; 
//					return cityDTO; 쓰고 시작하면 에러를 제외하고 사용할 수 있음/ 에러 난 곳을 찾으려고 하면 해당된 곳이 에러라고 안뜨는 경우도 있다함
					
					CityDTO cityDTO =null;
						System.out.println(" 도시명을 입력하시오 ");
						String name =sc.next().toUpperCase(); 
							
					
						//향상된 for
						
						for(CityDTO cityDTO2 : ar) {
							
							if(name.equals(cityDTO2.getName().toLowerCase())) {
								cityDTO = cityDTO2;
								break;
						}
				
					
									
						 
				}
				
				
				
				return cityDTO;	 //찾으면 못찾으면 null		


}



}



