package org.object3;

import java.util.Random;
import java.util.Scanner;

import org.object2.Method4;
import org.object2.member;

public class ReturnTest {
	// class를 이용하여 리턴한 경우 
	//makeAccount 
	//title, host, 통장번호, 잔액을 입력받아서 리턴
	
	public Account makeAccount() { //클래스 = 데이터 타입
		Scanner sc= new Scanner (System.in);
		Account account =new Account();
		
		account.title = "신한은행 통장";
		account.host= "안다은";
		account.numbers="110-434-23456";
		account.balance = 123456789L;
		
		return account;//account의 주소값을 되돌려줌  
	}
	
	
	
	// 배열을 이용하여 리턴한 경우
	// 호출시 숫자를 받아서 그 숫자만큼 랜덤한수를 뽑아서 리턴
	public int [] makeRandom2 (int count) {  // int count한만큼 숫자뽑아달라
			Random randeom =new Random();
		
			int[] nums = new int [count]; //int를 []모으는 nums는 int count만큼 
		for (int i=0; i<count; i++) {
//		int num = randeom.nextInt(50);
//		nums [i] =num;
			nums [i] =randeom.nextInt(50);
		}
	return nums; //nums를 되돌려준다
	}
	

	
	public int makeRandom() {//void-리턴할게 없음, 있으면 데이터타입
		Random random = new Random();
		int num= random.nextInt(50);//();값은 인자값
		//return 리턴하려는 데이터
		
		//return num; 
		return '3'; //return int일 경우 return "3"; 선언시 호출하는 타입이 달라 에러 발생 
					//return int일 경우 return '3'; 선언시 ''는 int 보다 작은 char 데이터 타입이라 형변환되어 에러가 발생하지 않음
	}//누군가가 메서드를 호출하면 다시 되돌려줌, 리턴은 1번만 가능
	
	public void info() {
		
		System.out.println("실행 후 그냥 종료");
	}
	}

