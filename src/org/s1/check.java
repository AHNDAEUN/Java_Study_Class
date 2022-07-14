package org.s1;

public class check {
// 인공지능
	//이력서를 커트
	
	public boolean resuneCut(Resume r) {
		if(r.age>=40) {
			r.check=false;
			return false;
			
			
		}else {
			r.check= true;
			return true;
			
		}
		
	}
}
