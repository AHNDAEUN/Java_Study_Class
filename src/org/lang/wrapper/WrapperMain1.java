package org.lang.wrapper;

public class WrapperMain1 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);

		String num= "10";
		
		Integer integer =new Integer(num);//Integer integer =new Integer(num);
		int n= integer.intValue(); //문자 num을 숫자 num으로 변경됨 
		
		
		n=50;
		integer = new Integer(n);

		integer = n; //참조변수가 들어있는 integer에 정수를 넣으려고 함// 형변환없이 자동으로 감싸는 법 // auto-boxing
		
		n=integer; //auto-unboxing
		
		long l = 10L;
		Long ll = l;
		
		integer =(int)l;
	//	integer =(int)ll; // ll은 프리미티브가 아니라서 강제 형변환 안 됨, 레퍼런스는 형변화없음  
	
		
		
		
		// 문자열을 프리미티브 타입으로 변환
		String num1 ="50";
		String num2 ="3.14";
		String num3 ="60";
		String num4 ="ten"; //문자열 중에서 숫자형식만 반영 문자는 안 됨 
		
		int n1= Integer.parseInt(num1);
		int n4= Integer.parseInt(num4);
		double n2 = Double.parseDouble(num2);
		long n3 =Long.parseLong(num3);
		
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*2);
		System.out.println(n4*2);
		
		System.out.println(n+2); 

	
	}
	 
	
}
