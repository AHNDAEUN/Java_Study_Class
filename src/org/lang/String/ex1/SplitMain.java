package org.lang.String.ex1;

public class SplitMain {//실행하거나 테스트 용도
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkService ws =new WorkService();
		WorkerView wv = new WorkerView();
		
		
		WorkerDTO[] workerDTOs  =ws.init();
		wv.view(workerDTOs);
	
	
		int num =10;
		
		String str =String.valueOf(num);
		System.out.println(str); //str은 더이상 숫자10아니라 문자열 "1","0"임
		
	}

}
