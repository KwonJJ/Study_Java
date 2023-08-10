package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExam03 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 이름은? ");
		String name = s.next();
		byte[] data = name.getBytes();

		for (int i = 0; i < data.length; i++) {
			os.write(data[i]); // A, B, C 를 하나씩 출력
		}

		os.flush();
		os.close();

	}

}
