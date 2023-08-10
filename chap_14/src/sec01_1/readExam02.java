package sec01_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class readExam02 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Writer writer = new FileWriter("c:/temp/address3.txt");

		System.out.println("주소 입력");
		String address = s.nextLine();

		writer.write(address);

		writer.flush();
		writer.close();

		Reader reader = new FileReader("c:/temp/address3.txt");
		char[] buffer = new char[5];
		int readN = reader.read(buffer, 0, 5);
		if (readN != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.print(buffer[i]);
			}
		}
		reader.close();
	}

}
