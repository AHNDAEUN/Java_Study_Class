package org.lang.list_ex1;

public class CityDTO {// 데이터 가방이자 데이터를 운반 

	
			// 도시의 날씨 정보를 담고 있은 클래스
			// 모든 멤버변수는 접근 지정자  private
	
			private String name; //도시명 
			private double gion; //기온정보 31.2 
			private int hum; //습도정보 80 
			private String status; //맑음 비 눈 태풍 
			
			
			
			//getter, setter
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getGion() {
				return gion;
			}
			public void setGion(double gion) {
				this.gion = gion;
			}
			public int getHum() {
				return hum;
			}
			public void setHum(int hum) {
				this.hum = hum;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			
			
			
}
