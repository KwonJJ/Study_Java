package sec03.exam01;

import java.util.Scanner;

public class PromotionExample02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //s = 키보드로 입력받은 값을 입력

		System.out.println("한 글자를 입력하세요 : ");
		String a = s.next(); //next = 사용자가 입력한 것을 끌어서 String를 읽음, next자체는 문자열로 받음
		char b = a.charAt(0); /*charAt(숫자) = 문자열을 문자로 형변화 시켜줌(문자열에서 해당 숫자 위치에 
		                                       해당하는 문자열을 char타입으로 변환), 첫 번째 글자 = 0, 
		                                       두 번째 글자  = 2, 세 번째 글자 = 3, ...,
		                                       toString(데이터) = 데이터를 String 타입으로 변환
		                                       */
		int c = b;
		

		System.out.println(a + "의 유니코드 = " + c);
		
		s.close();
	}

}
/*
 * 한 글자를 입력하세요 :
 * 사용자가 입력한 글자의 유니코드를 출력합니다.
 * ex) 입력하신 '사'의 유니코드는 49324입니다.
 * Scanner s = new Scanner(System.in);
 * */
