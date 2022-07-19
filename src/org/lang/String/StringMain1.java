package org.lang.String;

public class StringMain1 {

	public static void main(String[] args) {
			
//			String  str1 ="iu"; // ="iu"; 리터널(상수)데이터
//			String  str2 ="iu";
//			String  str3 = new String ("iu");
//			
//			System.out.println(str1==str2);
//			System.out.println(str1==str3);
//			System.out.println(str1);
//			System.out.println(str2);
//			System.out.println(str3);
//			System.out.println("========================");
//			System.out.println(str1.equals(str2)); //주소가 아닌 내용비교
//			System.out.println(str1.equals(str3)); // 안에 있는 데이터가 같은지 오버라이딩함 

	StringStudy ss = new StringStudy();
	ss.studyCharAt();
	
	
	
	
	StringStudy2 sd = new StringStudy2();
	//	sd.studyIndexofEx1();
	//	sd.StudyIndexOf();
	//sd.studysubString();
	//	sd.ex2();

	
	StringStudy3 s3 =new StringStudy3();
	s3.stringSplit();
	s3.stringSplit2();
	s3.stringSplit3();
	
	}

}
