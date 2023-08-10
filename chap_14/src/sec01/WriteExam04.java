package sec01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WriteExam04 {

	public static void main(String[] args) throws Exception {
		/*
		 * OutputStream os = new FileOutputStream("c:/temp/test3.db");
		 * 
		 * byte[] array = {10, 20, 30};
		 * 
		 * os.write(array);
		 */

		OutputStream os = new FileOutputStream("c:/temp/test3.txt");
		
		byte[] data = "ABC".getBytes();

		os.write(data);

		os.flush();
		os.close();

	}

}
