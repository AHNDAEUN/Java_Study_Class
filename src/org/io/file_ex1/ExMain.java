package org.io.file_ex1;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDAO studentDAO =new StudentDAO();
		

			try {
				studentDAO.getList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
			
	}


