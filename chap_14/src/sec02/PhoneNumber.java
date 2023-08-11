package sec02;

import java.io.*;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("c:/temp/phone.txt");
		Writer w = new OutputStreamWriter(fos);
		// writer -> 새로운 글을 작성하는 역할

		while (true) {
			System.out.println("전호 번호 입력");
			String n = s.nextLine();

			if (n.equals("그만")) {
				break;
			}
			w.write(n + "\n");
		}
		w.flush();
		w.close();

		Reader reader = new FileReader("c:/temp/phone.txt");
		// reader -> 이미 있는 파일을 불러오는 역할
		BufferedReader br = new BufferedReader(reader);

		while (true) {
			String data = br.readLine();
			if (data == null) {
				break;
			}
			System.out.println(data);
		}
		br.close();
	}
}
