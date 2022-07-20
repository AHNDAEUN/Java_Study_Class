package org.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {

	
	
	
     //메서드명: juminckeck
     // 이 메서드도 주민번호 입력받음
     // 9   7    1   1   2   4 -   1   2   3   4   5   6   7 (마지막 7번은 체크용 번호)
	// *2   *3   *4  *5  *6   *7   *8  *9  *2  *3  *4  *5
	// +18    21   4    5   12  28   8    18  6   12  20  30
	//총합 :192 
	
	//총합을 11로 나누어서 나머지를 구함 
	//192/ 11로 나눈 몫17 나머지 5
	// 나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교 
	//1.11 -5 =6 
	//2.11-0= 11
	
	// 만약에 위의 연산결과가 두자리라면 
	//위의 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	//ex) 2. 11/ 10 나머지 1 을 다시 체크용번호와 비교 


	
	//*문자열을 숫자로 만들자


public void jumincheck() {	
	
	Scanner sc= new Scanner(System.in); 
	System.out.println("주민번호 입력");
	String jumin = "971224-1234567";
	
	int count = 2;
	int sum =0; // 곱하기한 결과물을 다 더하기 위해 쓰려고 작성해둠 
	for (int i=0; i<jumin.length()-1;i++) {
	
	// 꺼내는 방법
	//1. 하나의 문자열에서 일부분을 들어내는것 substring() 리턴타입 : String, 시작과 끝을 어떤게 할것인지 생각  
	
//	String num = jumin.substring(0,1);// 1,2  2,3 
//	
//	int n =Integer.parseInt(num);
	//2. 하나의 문자열에서 한글자씩 뺴내오는것 charAt() 리턴타입 : char  * 꺼내면 문자열로 바꿔줘야함 , 한글자만 뚝딱 꺼내오면됨 
	
//	char ch = jumin.charAt(0); //1,2,3 // 선언하고 안쓸 것 같다면 valueof안에 쓸 수 있음  
	
	//char 문자열로 바꾸는 방법
	//int n =Integer.parseInt(ch+"");
	
//① String num = String.valueOf(ch); //valueof 에 문자열을 넣고  parseInt로 숫자로 바꾸자!
//	int n =Integer.parseInt(num);
	
		
		
//	char 꺼낸 차가 빼기랑 같으면 contiue
//	형식이 고정일때 6번이면 건너뛰자
//	주민등록을 받았을때 -는 필요없으니, 뺴버리자 이중에 쓰면됨 
		
//   i가 6번이면 건너뛰자
		
		if(i==6) {
			
			continue;
		}
		
	//①을 두줄을 한줄로 쓰는법 
	int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
	
	sum= sum+ n * count;
	count++;
}
	
	// 나머지 구하기 
	
	int check = sum%11;
	//check에 들어간 갚에서 나머지를 다시 빼기 
	check = 11-check;
	
	
	//연산결과가 두자리라면 10으로 나눈 나머지
//	if (check==10 || check==11)
	if (check >9) {
		
		check =check%10;
	}

	//check용 번호
	int checkNum =Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));

	if (check ==checkNum) {
		
		System.out.println("정상 주민번호");
	}else {
		
		System.out.println("비정상 주민번호");
	}

}
}
