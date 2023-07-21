package sec01;

public class 널포인터예외예제 {

	public static void main(String[] args) {
		String data = null;
		int num = 5;
		
		System.out.println(data.toString());
		// 실행 예외 발생 : 에러 코드로 확인해야함.
		
		/*
		 * System.out.println(num.toString());
		 * 일반 예외 발생 : 프로그래머가 미리 확인 가능함.
		 */
		
		String b = String.valueOf(num);
		System.out.println(b);
		
		String c = Integer.toString(num);
		System.out.println(c);
		
		/*
		 * valueOf, toString 모두 Object타입의 값을 String으로 변환
		 * 
		 * 단, toString은 null처리 안됨
		 * Object 담긴 값이 String 아니여도 출력
		 * 
		 * valueOf는 null 값 처리됨
		 * Object값이 String이 아니면 출력 안됨
		 */
	}

}
