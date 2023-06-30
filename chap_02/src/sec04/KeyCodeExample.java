package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {//throws Exception -> 예외상황을 화면에 출력함
		int keyCode;
		/*keyCode = System.in.read(); //e값 = 101
		System.out.println("키코드 :" + keyCode);

		keyCode = System.in.read(); //줄바꿈 처리 값 = 13
		System.out.println("키코드 :" + keyCode);
		
		keyCode = System.in.read(); //엔터 값 = 10
		System.out.println("키코드 :" + keyCode);*/
		
		while(true) { //반복문 조건에 true처리 시 계속 반복
			keyCode = System.in.read();
			System.out.println("키코드  : " + keyCode);
		}
		
	}

}
