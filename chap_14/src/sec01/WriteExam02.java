package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam02 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test2.txt");
		
		byte[] data = "ABC".getBytes();
		
		for(int i = 0; i < data.length; i++) {
			os.write(data[i]); // A, B, C 를 하나씩 출력
		}
		
		os.flush();
		os.close();

	}

}
