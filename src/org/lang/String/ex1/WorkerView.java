package org.lang.String.ex1;

public class WorkerView {

	
	
	//view
	//WorkerDTO들을 받아서 정보를 출력 => 배열을 선언
	// 메인에서 서비스 호출하고 뷰로 보냄 
	
	
	public void WorkerView(WorkerDTO dtos){
		
		
		for (WorkerDTO dto: dots) {
			
			System.out.println("이름:"+dto.getName());
			System.out.println("부서:"+dto.getDepertment());
			System.out.println("직급:"+dto.getJob());
			System.out.println("전화번호:"+dto.getPhone());
		}

		
		
		
		
		
	}
}
