package sec02;

public class ThrowsExam {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz1 = Class.forName("java.lang.Scanner"); // 오류발생
		Class clazz = Class.forName("java.util.Scanner"); // 오류발생 안함
	}

}
