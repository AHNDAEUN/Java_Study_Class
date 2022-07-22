package org.io.file_ex1;

import java.awt.dnd.DropTargetListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO  {
	// DAO: Data Transfer Object 데이터에 직접적으로 접근하는 클래스
	// DTO: 수동/데어터를 갖고 있음  Data Access  Object
	// file data에 접근 // 접근 데이터를 읽거나 쓰는 용도
	
	
		//2. setList
	public int setList(ArrayList<StudentDTO>ar) {
		return 0;
		// 예외처리는 내부에서 처리 
		// list로 받은 데이터들을 studentdata에다가 작성
		// 기존의 내용은 삭제 (덮어쓰기) 
		// 새로운 내용 작성 ( 작성형식은 기존 내용의 형식과 동일하게 )
		// int를 리턴하는 이유: 1.리턴 정상적인 성공 0.리턴 예외가 발생했을 경우
	}
	
		//1.getlist : 파일의 내용을 읽어서 작업
		// studentdata파일의 내용을 읽어서 dto에 작업 
	
	
	public ArrayList<StudentDTO> getList() throws Exception {
		
	ArrayList<StudentDTO> ar =new ArrayList<>();
	File file =new File("C:\\Study","studentdata.txt");
	FileReader fr =new FileReader(file);
	BufferedReader br =new BufferedReader(fr);
	
	
	String str =br.readLine();
	System.out.println(str); //str: iu,1,56,54,85

	String [] info =str.split(",");//info: 
	
	StringTokenizer st = new StringTokenizer(str,",");
	
	
	
	while(st.hasMoreTokens()){
	StudentDTO studentDTO = new StudentDTO();
	studentDTO.setName(st.nextToken());
	studentDTO.setNum(Integer.parseInt(st.nextToken()));
	System.out.println();
	
	studentDTO.setKor(Integer.parseInt(st.nextToken()));
	studentDTO.setEng(Integer.parseInt(st.nextToken()));
	studentDTO.setMath(Integer.parseInt(st.nextToken()));
	studentDTO.setTotal(Integer.parseInt(st.nextToken( )));
	studentDTO.setAvg(Integer.parseInt(st.nextToken()));
	
	ar.add(studentDTO);
	
	}
	

	return ar;
	
	

		
		
	 
		
			
		
	
	

		}
	
	
}
	
