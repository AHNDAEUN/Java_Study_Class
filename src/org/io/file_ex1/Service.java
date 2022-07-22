package org.io.file_ex1;

import java.util.ArrayList;

public interface Service {
	
	//추상메서드를 넣을 수 있음
	
	
	//studentDAO에서 getlist를 호출하고 총점과 평균을 각각 계산해서 대입하고 그 List를 리턴 
	
	
	public ArrayList<StudentDTO> getList() throws Exception;
		
	
	
	public int setList (ArrayList<StudentDTO> ar)  throws Exception; // setList - 리스트의 데이터를 꺼내서 파일로 리턴 
	// 	studentDAO에서 setlist를 호출하고 
	//그 결과를 리턴
		
	
	
		public StudentDTO getStudent(ArrayList<StudentDTO>ar) throws Exception;
		//찾을려고 하는 학생의 번호를 입력받아서 찾은 학생을 리턴 
		
		
		
		public int setStudentDelete(ArrayList<StudentDTO>ar) throws Exception;
	//삭제하려는 학생의 번호를 입력받아서
		//일치하는 학생일 삭제 
		//삭제가 성공하면 1을 리턴, 실패하면 0을 리턴 
		
		public void setStudentAdd(ArrayList<StudentDTO>ar)throws Exception;
		// 학생 한명을 추가 (리턴x)
		
}
