package org.lang_ex1;

public class Phone {
	
	private int price;
	private int size;
	
	//equals 메서드 오버라이딩
	//각 멤버의 값이 같으면 true, 하나라도 틀리면 false 리턴 
	//hint : 참조변수 this 
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	//@Override // p1이 호출
		//= 선언문만 동일하게 가져올 수 있음 
	public boolean equals(Object obj) {// obj-> p2
	
			Phone phone = (Phone)obj; //다형성
			// this.getPrice()=phone.getPrice() // this ==p1 (자기자신)phone=p2
			boolean check = false; 
			
				if(this.getPrice()==phone.getPrice() &&this.getSize()==phone.getSize()) {
					
					//check=true;
					check=!check; // check값을 거꾸로 
				}
			return check;

		}
		
		
		
	
	
	}
	
	


