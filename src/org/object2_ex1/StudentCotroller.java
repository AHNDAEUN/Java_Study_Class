package org.object2_ex1;

import java.util.Scanner;

import org.object1.ex1.StudentSevice;
import org.object1.ex1.StudentView;

public class StudentCotroller {

	//start 메서드 선언
	
	public void start() {
		StudentSevice studentSevice =new StudentSevice();
		StudentView sv = new StudentView();
		
		Scanner sc = new Scanner(System.in);

		
		Student[] students=null;
		
		boolean check=true;
		while(check) {
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 정보 추가");
		System.out.println("6. 프로 그램 종료");
		
		int select = sc.nextInt();
		
		
		switch (select) {
		case 1:
			System.out.println("1");
			students = studentSevice.makeStudents();
			break;
			
		case 2:
			System.out.println("2");
			sv.viewAll(students);
			break;
			
		case 3:
			System.out.println("3");
			Student student = studentSevice.findStudent(students);
			
			if(Student != null) {
				sv.viewOne(student);
				
			}else {
				sv.viewMessage("찾을 수 없습니다.");
			}
			break;
			
		case 4:
		
			System.out.println("4");
			break;
		
		case 5:
			System.out.println("5");
			break;
			default:
			check=!	check;			
		}
	
		}
	}
}

