package org.object1.ex1;

import java.util.Random;
import java.util.Scanner;

public class StudentSevice {

	// 스캐너를 멤버변수로 선언하면 메서드 안에서 사용가능
		Scanner sc; 
		// 바로 사용 불가능, 객체선언해야함 //객체만들땐 생성자 호출
		
		
		public StudentSevice() { // 매개 변수가 없으면 기본생성자
			sc=new Scanner(System.in);
			
		}
		
		
		//removeStudent
		//학생들의 정보를 받아서
		// 삭제하려는 학생의 번호를 입력받음
		//학생의 번호와 일치하는 학생을 삭제 
		// 남은 학생정보들을 리턴 
		
		
	
	//add Student
	// 학생들의 정보를 받아서 
	// 학생한명 추가
	//추가된 학생정보들을 리턴
		public Student addStudent () {
			
			sc= new Scanner(System.in);	
			
			System.out.println(" 학생의 번호를 입력하시오 ");

			Student student1 =new Student();
			
			student1.setName(sc.next());
			student1.setNum(sc.nextInt());
			
			student1.kor=sc.nextInt();
			student1.eng=sc.nextInt();
			student1.math=sc.nextInt();
			
				return student1;
		}
		

		
	
	// findStudent
	// 검색하고 싶은 학생의 번호를 입력받아서,
	// 첫번째 학생을 꺼내서 그 학생의 번호랑 내가 입력한 번호를 비교
	// 같은 번호의 학생을 찾아서 그 학생 한명을 리턴
	// 없으면 null; 리턴
	
	public Student findStudent(Student[] students) {
//		Scanner sc = new Scanner(System.in);// 선언을 지역변수에만 해뒀기때문에 여기서만 사용가능
		
		System.out.println(" 학생의 번호를 입력하시오 ");
		int num =sc.nextInt(); 
		// 리턴하려는 학생
		Student student =null;
		
		for (int i=0; i<students.length; i++) {   
	
			if(num==students[i].num) { 
				student =students[i];
				break;
				
			}
				
		}
					return student;	 //찾으면 student 못찾으면 null		
		 
}

	
	// makeStudents 메서드 생성
		// 인원수 입력 받고,
		// 학생 수 만큼 정보를 입력 받고
		//총점 평균은 자동으로 출력
		// 학생들을 리턴 
	
	
	public Student[] makeStudents() {
//	Scanner sc= new Scanner(System.in);
		System.out.println("학생 수를 입력 하시오.");
		int count =sc.nextInt();
		
		Student[] sts =new Student[count]; 
	//배열에 담으려고 하는 학생 정보//모으려고하는 데이터타입 :count 만큼
		
		for(int i=0; i< sts.length; i++ ) {
		Student st =new Student(); 
		//내가 만들고 싶은 클래스명, 변수명:
				System.out.println("학생 이름 입력");
				st.setName(sc.next());
				
				System.out.println("학생 번호");	
				st.setNum(sc.nextInt());
				
				System.out.println("국어 점수");
				st.setKor(sc.nextInt());
				
				System.out.println("수학 점수");
				st.setMath(sc.nextInt());
				
				System.out.println("영어 점수");
				st.setEng(sc.nextInt());
		
				st.setTotal();
				
				sts [i]=st;
			
			
	}
		
			return sts;
}
	

}




