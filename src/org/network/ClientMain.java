package org.network;

public class ClientMain {

	public static void main(String[] args) {
	System.out.println("Cliet Start");

	Client1 c1 = new Client1();
	
	try {
		c1.send();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Cliet Finish");

	}

}
