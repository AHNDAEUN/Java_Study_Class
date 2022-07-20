package org.lang.String.ex1;

import java.util.StringTokenizer;

public class WorkService {
	// 생성자 자동완성 기능 = work+ ctrl + spacebar 
	
	
	
	//private String info;
	private StringBuffer sb;
	
	 public WorkService  () { // 생성자 객체 공식 
	
	 sb= new StringBuffer();


		 sb.append ("bong -기획전략-대리-010111111");
		 sb.append (",sem -경영지원-주임-01022222");
		 sb.append (",yuna-인사과-과장-33333");
		 sb.append (",juhan-마케팅-부장-4444444");
		
			}

	 
	 public WorkerDTO[] init() {
		 //info 파싱해서 WorkerDTO에 대입하고
		 //WorkerDTO를 모든배열로 리턴
		 
		 String info =sb.toString();
		 String newInfo =info.replace(",", "-");
		 		 
		 	// StringTokenizer  문자열을 파싱하는데 전문적으로 쓰이고 있음 
		 StringTokenizer st = new StringTokenizer (newInfo,"-");
			WorkerDTO [] workerDTOs = new WorkerDTO[st.countTokens()/4];
			int index=0;
			while(st.hasMoreTokens()) {
				WorkerDTO workerDTO = new WorkerDTO();
				workerDTO.setName(st.nextToken());
				workerDTO.setDepertment(st.nextToken());
				workerDTO.setJob(st.nextToken());
				workerDTO.setPhone(st.nextToken());
				workerDTOs[index]=workerDTO;
				index++;
		 }
			
		 
		 
		 
		 //		 String[] infos = newinfo.split("-");
		//	WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
			//
//					System.out.println(infos.length);
//					//i 0, 1, 2, 3
//					for(int i=0;i<infos.length;i++) {
//					
//						WorkerDTO workerDTO = new WorkerDTO();
//						workerDTOs[i/4]=workerDTO;
//						workerDTO.setName(infos[i].trim()); 		//4, 8
//						workerDTO.setDepartment(infos[++i].trim());	//5, 9
//						workerDTO.setJob(infos[++i].trim());			//6, 10
//						workerDTO.setPhone(infos[++i].trim());		//7, 11
		 
		 
//	 }
	 
	 
		return workerDTOs;
}
	 
	 

	
//		 	info ="bong -기획전략-대리-010111111";
//			info =info+",sem -경영지원-주임-01022222";
//			info = info+",yuna-인사과-과장-33333";
//			info = info+",juhan-마케팅-부장-4444444";
//	public WorkerDTO [] init() {
//		//info 파싱해서 WorkerDTO에 대입하고
//		//WorkerDTO를 모은배열을 리턴 
//		
//	String newinfo= this.info.replace(",", "-");
//	
////( 확인용)		System.out.println(this.info);
////				System.out.println(newinfo);
//		
//	String [] infos =newinfo.split("-"); //자르기
//	
//			WorkerDTO [] dtos =new WorkerDTO[infos.length/4]; //인포스의 묶음을 4로 나누자
//	
//			for (String str : infos) {
//			// i-> 0, 1, 2, 3
//				System.out.println(str);
//
//			System.out.println(infos.length); // infos.length(16) 이중에서 4개를 꺼내야 dto가 만들어짐 
//			
//			for (int i=0; i<infos.length; i++) {
//			
//				
//				
//				WorkerDTO dto = new WorkerDTO();
//				dtos[i/4] = dto; // 어떤 인덱스가 들어가는 WorkerDTO를 만들어야함
//								 // 0,4,8,10 => 0,1,2,3으로 바꾸고 싶음 이럴때 i를 4로 나눔
//			
//			dto.setName(infos[0].trim());		 // 4 ,8
//			dto.setDepertment(infos[++i].trim()); // 5, 9, (++i,i+1)
//			dto.setJob(infos[++i].trim());		 // 6, 10
//			dto.setPhone(infos[++i].trim());		 // 7, 11
//			
//			}
//			
//			return dtos;
//			
//			System.out.println(dto.getName());
//			System.out.println(dto.getDepertment());
//			System.out.
//			4
//			println(dto.getJob());
//			System.out.println(dto.getPhone());
//			
			
//			}
		
		
		
//	}
}
