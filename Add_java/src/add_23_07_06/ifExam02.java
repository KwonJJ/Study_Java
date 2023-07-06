package add_23_07_06;

import java.util.Scanner;

public class ifExam02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("출전 가수 이름은 무엇인가요?");
		String name = s.next();
		
		if(name.length() == 3) { //문자열변수.length -> 문자열 변수의 길이
			System.out.println(name.charAt(2));
		}else {
			System.out.println(name.charAt(1));
		}
	
		/*
		 * 가수 이름(3글자) 입력
		 * ex) 장문복, 이상
		 * 만약 이름이 3글자라면 세번째 글자를 출력 -> ex.복
		 * 만약 이름이 2글자라면 두번째 글자를 출력 -> ex.상
		 * 
		 * if이용해서 출력
		 */
	}

}
