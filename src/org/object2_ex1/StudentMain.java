package org.object2_ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		StudentCotroller ssc =new StudentCotroller();
		
		
		System.out.println("프로그램 시작");
		
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 학생 정보 추가");
		System.out.println("6. 프로 그램 종료");
		
		int select = sc.nextInt();
		
		if (select==1) {
		
		ssc.st1();	
		}else if(select==2) {
			
			ssc.st2();
		}else if(select==3) {
			
			ssc.st3();
		}else if(select==4) {
			ssc.st4();
			
		}else if(select==5) {
			ssc.st5();
			
		}else {
			ssc.st6();
		}
//		
//		switch select {
//			case1:
//				break;
//			case2:
//				break;
//			case3:
//				break;
//			case4:
//				break;
//			case5:
//				break;
//			default:
//				check=!	check
			
//		}
		
		
		
		System.out.println("프로그램 종료");
		//student controller의 start를 호출
	}

}
