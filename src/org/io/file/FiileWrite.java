package org.io.file;

import java.io.File;
import java.io.FileWriter;

public class FiileWrite {

	
	public void Write() throws Exception{
		
		
		File file =new File("C:\\Study", "test.txt");
		FileWriter fw = new FileWriter(file,true); //true 기존데이터 덮어씌움 
		
		fw.write("Another String\r\n");
	
	//	fw.flush();//버퍼를 강제로 밀어내고 해당파일을 쓸 수 있음
		          //버퍼는 밀어낸 자리에 고대로 있음 ex)주사기- 밀어내면 그대로있고 원상태로 돌아오려면 다시 잡아당겨줘야함 
					//lr로 다시 다음으로 돌아오게 밀어내는 역할 , \r\n 이렇게 같이 씀  
		fw.write("내일은 토요일 \r\n");//   \r\n 다음에 연결되는 애들이 다음칸에서 적히게됨 
								   //  \n 안넣으면 그다음 데이터가 옆으로 붙음 
		fw.flush();
	
	
	
	}
}
