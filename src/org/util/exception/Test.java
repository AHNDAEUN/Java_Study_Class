package org.util.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.TableView.TableRow;

public class Test {

	public void t4() throws Exception {
		
		
		//유치원생 프로그램 
		// 0~99까지 알아 근데, 3자리수는 몰라
		int num =48;
		int num2 =82;
		int num3 =num+num2;
		int num4 =num - num2;
		
		
		if (num3>99) {
			
			//throw new My1Exception(); //throws는 메서드에서 사용 
		//빨간줄 뜬 이유 : 예외객체를 만들어놓고 왜 처리 안함 빨리 처리해
		
			1
			// 기존에 있는 Exception 객체로 만들어줘도 되고 내가 만든 MyException 객체를 만들어줘도 됨 
		}
		
		if (num4<0) {
			
			throw new MyException(" 그런 숫자 몰라요 ");
		}
		
	} 
	
	
	
	
	public void t3() throws NullPointerException ,ArithmeticException{ //여기서 발생할 예외를 던짐, 쉼표로 구분해주고 또 다른 예외를 연결하여 작성해줌  
		
		String str =null; 
		System.out.println(str.toString());// nullpoint 예외 발생
		
	}
	
	
	
	
	public void t2() {
		
		String[] str = {"10"," five", "2.14","0"};
		Scanner sc =new Scanner(System.in);
		
		
		for (String s: str) {
		try {
			
			System.out.println("숫자를 입력하세요");
			int n= sc.nextInt();
			int num =Integer.parseInt(s);
			num =10/num;
			System.out.println(num);
			
		}catch(NumberFormatException e) {
			
			//예외처리
			System.out.println("예외처리");
		}catch(ArithmeticException e) {
		
		System.out.println("수학 오류 해결");
		
		}catch(Exception e) {
			// 위에서 못잡는 것을 여기서 다잡음 = (다형성), 많부모타입을 찾자 
		
		e.printStackTrace(); // stack에 에러가 있을꺼야 에러를 추적하고 그 에러메세지를 여기서 출력할꺼야 / 메세지만 뿌려주고 강제종료되지 않고 정상 종료가됨 
								// 어떠한 예외가 생겼는지 알려주고 메세지를 프린트 해줌
		}catch(Throwable e) {
		
		
		
		}
		
	
		}
	
	}
	
		
	
	
	
	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random =new Random();
		String str =null; 
		
		if(random.nextInt(10)%2==0) {
			
			str="10";
		}
		
		int num = Integer.parseInt("10"); //new NumberException(); 이 생성
		//num = num/random.nextInt(2);
		try {
			num = num/5;
			System.out.println(num);
		}catch(ArithmeticException e){ //예외객체를 던지면 catch에 잡음  
			// 예외처리를 작동
			System.out.println("예외처리");
		} //예외가 발생하지 않으면 정상 진행
		
		
		System.out.println(num);
		
		System.out.println(str.toString());
		
		new NullPointerException();
		
		System.out.println("t1 메서드 종료");
	}
}
