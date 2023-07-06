package sec04;

public class returnExam {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int plus1(int x, int y) {
		byte result =(byte) (x + y);
		return result;
	}
	public static void main(String[] args) {
		returnExam reExam = new returnExam();
		
		int result1 = reExam.plus(200, 300);
		System.out.println(result1);
		
		int result2 = reExam.plus1(200, 300);
		System.out.println(result2);
	}

}
