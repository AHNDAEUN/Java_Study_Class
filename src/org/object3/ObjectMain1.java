package org.object3;

public class ObjectMain1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		
		rt.info();
		int num =rt.makeRandom();//5
		System.out.println(num);
		
		// 매개변수가 없는데 강제로 넣었을때 에러발생

		System.out.println("+++++++++++++++++++++++++++");
		
		int [] nums= rt.makeRandom2(10);
		for (int i=0; i<nums.length; i++) {
			
			System.out.println(nums[i]);
			
		}
		System.out.println("===========================");
		
		Account account = rt.makeAccount();
		System.out.println(account.title);
		System.out.println(account.host);
		System.out.println(account.numbers);
		System.out.println(account.balance);
		
		
	}

}
