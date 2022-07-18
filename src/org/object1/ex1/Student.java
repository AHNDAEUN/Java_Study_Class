package org.object1.ex1;

public class Student {

	
	String name;
	private	int num;
	private	int kor;
	private	int math;
	private int  eng;
	private int total;
	private	int avg;

		

	
		

//	String name;
//		int num;
//		int kor;
//		int math;
//	int  eng;
//	 int total;
//		double avg;
	
	
	
public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public void setAvg(int avg) {
		this.avg = avg;
	}


	//총점계산 메서드 선언
	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public void setTotal() {
		this.total=this.kor+this.math+this.eng;
		this.setavg();
	}
						//갈색 지역변수
		//지역변수를 멤버변수로 쓰고 싶으면 total 뒤에 this.작성
		//이 메서드를 호출하면 국수영을 더해서 넣으려고함
//		toal = this.kor+eng+ math; //멤버변수  
//	


	private void setavg() {
			this.avg =this.total/ 3;
		//	private-> 안전하게 쓸수있도록 외부의 노출을 막아 사용하려고 하는것 
}
}

//	멤버변수 메모리 영역 heap 
//	(매개)지역변수 메모리 영역 stack
//	그래서 같은 int total이라도 메모리 영역이 달라서 중복 작성 가능