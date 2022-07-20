package org.lang.String.ex1;

public class WorkerDTO {// DTO 데이터를 담는 박스이며 데이터를 운반함 
						//vo 읽기전용
	
	//멤버변수의 접근지정자 =무조건 private
	
	private String name; // 이름
	private String depertment; //부서명
	private String job;// 직급
	private String phone;// 전화번호
	
	
	

	//생성자는 기본 생성자 필수 = 생성자 생성을 안하면 기본으로 자동 생성 
	
	//setter, getter

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
