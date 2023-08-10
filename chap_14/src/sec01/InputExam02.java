package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExam02 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/temp/test3.db");
		byte[] buffer = new byte[100];

		while (true) {
			int readByteN = is.read(buffer);

			if (readByteN == -1) {
				break;
			}

			for (int i = 0; i < readByteN; i++) {
				System.out.println(buffer[i]);
			}
		}

		is.close();
	}

}
