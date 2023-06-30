package sec02;

public class 확인문제01 {

	public static void main(String[] args) {
		byte b = 5;
		//b = -b; -> 컴파일 에러(-가 붙으면 int로 자동변경됨)(1. 처음 byte b 를 int b로 바꾸면 에러 해결)
		int c = -b; //(2. b를 int c로 변경 후 result변수에 c를 넣으면 에러 해결)
		//b = (byte) -b; -> 3. byte로 강제 형변환해도 에러 해결

		int result = 10 / c;
		System.out.println(result);
	}

}
