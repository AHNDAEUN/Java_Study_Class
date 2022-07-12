package org.object1.ex1;

import java.util.Scanner;

public class Ex1Main3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Student[] students = new Student[3];
		
		
		for (int i=0; i<students.length;i++ ) {
			
			Student st = new Student();
			students[1]=st;
			System.out.println("이름 입력");
			//students[i].name=sc.next();
			st.name=sc.next();
				
				
			}
		
		}
	}


