package org.object2_ex1;

import java.util.Scanner;

import org.object1.ex1.Student;
import org.object1.ex1.StudentSevice;
import org.object1.ex1.StudentView;

public class StudentCotroller {


	Scanner sc;
	//객체 생성
	StudentView sv ;
	StudentSevice studentService ;
	Student [] students;
	
	public StudentCotroller() {
		sc= new Scanner(System.in);
		sv=new StudentView();
		studentService =new StudentSevice();
		
		// sc-> ss를 참조 (ss가 sc안에 있어야함)
		// sc-> sv를 참조 (ss가 sv안에 있어야함)
		
	}
	//start 메서드 선언
	
	public void start() {
		
		boolean check=true;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select= sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("1");
				students = studentService.makeStudents();
				break;
				
			case 2 :
				System.out.println("2");
				sv.view(students);
				break;
				
			case 3 :
				System.out.println("3");
				Student student = studentService.findStudent(students);
				if(student != null) {
					sv.view(student);
				}else {
					sv.view("찾는 학생번호가 없어요");
				}
				break;
		
			case 4 :
				System.out.println("4");
				studentService.addStudent();
				
				break;
				
			case 5 :
				System.out.println("5");
				break;
			default:

				System.out.println("종료중");
				check=!check;
				
				
				
			}
		}
	}
}
