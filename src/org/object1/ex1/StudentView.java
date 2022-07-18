package org.object1.ex1;

public class StudentView {

	//view Message
	//문자열을 받아서 그 문자열을 축력
	public void view(String message) {
	
		System.out.println(message);
	}
	
	
	//view One
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void view(Student student) {
		  
		
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getTotal());
		System.out.println(student.getAvg());
	}
	
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	
	public void view(Student[] students) {
		
		for (int i=0; i<students.length; i++) {
			
			System.out.println(students[i].getName());
			System.out.println(students[i].getNum());
			System.out.println(students[i].getTotal());
			System.out.println(students[i].getAvg());
	
				
			
		}
		
		System.out.println("viewAll 메서드 실행");
		
		
		
	}
	

	
	
	
	
}
