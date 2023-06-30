package sec02.exam03;

public class 응용문제01 {

	public static void main(String[] args) {
		System.out.println("1" + "2");
		System.out.println(true + ""); // 문자열 true로 인식
		System.out.println('A' + 'B'); // 아스키코드로 출력
		System.out.println('1' + 2); // 아스키 코드 1(49) + 2<char + int = int>
		System.out.println('1' + '2'); // 아스키 코드 1(49) + 2(50)<char + char =int>
		System.out.println('J' + "ava"); //
		// System.out.println(true + null);
		
		/*boolean var = 0; -> boolean 은 true 나 false를 넣어야함 "true"는 문자열로 인식, 0은 정수라 인식 안됨
		System.out.println(var);*/
		
		/*int v2 = 1e2; ->int 타입으로 넣으면 안됨, 실수 타입으로 넣어야 실행
		System.out.println(v2);*/
		
	}

}
