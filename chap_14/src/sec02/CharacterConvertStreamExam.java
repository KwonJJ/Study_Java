package sec02;

import java.io.*;

public class CharacterConvertStreamExam {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		// 메소드 매개변수 문자열

		String data = read();
		// read() -> 메소드, 매개변수 X, 리턴 타입 String

		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);

		writer.write(str); // OutputStreamWriter 보조스트림을 이용해서 문자 출력
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		// FileInputStream에 InputStreamReader보조 스트림을 연결

		char[] buffer = new char[100];
		int readCharN = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharN);
		return data;
	}

}
