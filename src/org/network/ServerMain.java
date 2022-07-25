package org.network;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server Start");

		Server1 server1 =new Server1();
		try {
			server1.receive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Server Finish");
	}

}
