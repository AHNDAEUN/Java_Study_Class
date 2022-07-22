package org.util.exception;

public class MyException extends Exception{

	
	
	public MyException() {
		// 확장하면 슈퍼가 생략되어 있음 super();
		super(" 몰라요 산수 포기 ");
	}
	
	public MyException (String message) {
		
		super (message);
	}
	
	

}
