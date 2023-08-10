package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class WriteExam05 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/address.txt");
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 주소는? ");
		String address = s.nextLine();
		byte[] data = address.getBytes();

		os.write(data, 5, 4);
		
		os.flush();
		os.close();

	}

}
