package org.object4;

public class Car {
 
	
	String company ="쌍용"; //-> ①변수선언과 동시에 초기화
	String brand;
	String color;
	boolean gear; //true 오토 false 수동
	
/// Instance 초기화 블럭{} ④
//	{this.company="기아";
//	this.brand="박스";
//	this.color="white";
//	this.gear=false;}
	
	public Car() {//객체만들때 car에서 호출 ③
		this("white"); //자기 생성자 내에서 또 다른 생성자를 호출하고 싶을때
		// this("white");위에 코드를 진행하면 오류 발생
		this.brand="아반떼";
		this.color="white";
		this.gear=true;
		
		
	}
	
	public Car(String color) {//객체만들때 car에서 호출 ③
//		this.company="현대";
//		this.brand="아반떼";
//		this.color="white";
//		this.gear=true;
		this("아반떼","color");
		
	public Car(String color, String brand) {
		this.company="현대";
		this.brand= brand;
		this.color= color;
		this.gear=true;
	
	
	
	 public void info() {
		 
		 System.out.println("Company:" +this.company);
		 System.out.println("Brand:" +this.brand);
		 System.out.println("Color:" +this.color);
		 System.out.println("Gear:" +this.gear);
	 }
	
}
