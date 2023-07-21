package sec02;

public class TryCatchFinallyExam02 {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다.");
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두 수의 합은 : " + result);
			/*
			 * 실행환경 매개변수에 숫자 넣으면 오류 발생 안되서 실행됨
			 */

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");

		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
