package sec01;

import java.util.Scanner;

public class switchpractice03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("수험번호 입력(생일 6자리와 영어 대문자) :");
		String a = s.next();
		char b = a.charAt(6);
		
		switch(b) {
		case 'A' :
			System.out.println("시험장소가 201호입니다.");
			break;
			
		case 'B' :
			System.out.println("시험장소가 202호입니다.");
			break;
			
		case 'C' :
			System.out.println("시험장소가 203호입니다.");
			break;
			
		default :
			System.out.println("다시 입력하세요.");
		}
		s.close();
	}
/* 
 * 수험번호를 입력
 * 수험번호는 생일 6자리와 영어 대문자의 조합 ex)030501B
 * 수험번호 끝자리가 A이면 "시험장소가 201호입니다."
 * 수험번호 끝자리가 B이면 "시험장소가 202호입니다."
 * 수험번호 끝자리가 C이면 "시험장소가 203호입니다."
 * switch사용
 * 
 * ex) <입력내용>
 * 수험번호 " 030507B
 * 
 * 실행결과 : 시험장소가 202호입니다.
 */
}
