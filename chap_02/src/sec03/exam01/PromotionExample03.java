package sec03.exam01;

import java.util.Scanner;

public class PromotionExample03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // s = 키보드로 입력받은 값을 입력

		System.out.println("출신학교를 입력하세요 : ");
		String a = s.next(); // String(문자열)을 읽음, next자체는 문자열로 받음
		
		System.out.println("현재 몇 학년 인가요? ");
		int c = s.nextInt();

		char b = a.charAt(2);// a.charAt(숫자) = (숫자)의 문자열값부터 문자값(한글자)을 입력
		if (b == '중') {
			System.out.println("당신은 중학교 " + c + "학년입니다.");
		} else {
			System.out.println("당신은 고등학교 " + c + "학년입니다.");
			
			s.close(); //스캐너 닫기(경고문구 닫기)
		}
	}
}
/*
 * 사용자가 입력 : ex) 제일중, 고려중, 제일고, 고려고 
 * 3번 째 글자가 '중'면 당신은 중학생입니다.
 * 3번 째 글자가 '고'면 당신은 고등학생입니다.
 */

/*
 * 출신 학교를 입력하세요.
 * 현재 몇 학년 인가요? -> 숫자
 * 
 * 출력 -> 당신은 중학교 3학년입니다.
 * 당신은 고등학교 2학년입니다.
 * */
