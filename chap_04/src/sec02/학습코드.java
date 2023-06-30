package sec02;

import java.util.Scanner;

public class 학습코드 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("학습 코드 입력 : ");
		String code = s.next();
		
		String year = code.substring(0, 2); //년도 출력
		char b = code.charAt(2); //과목 출력

		switch (b) {
		case 'M':
		case 'm':
			System.out.print("20" + year + "년도 수학과목 신청자입니다.");
			break;

		case 'K':
		case 'k':
			System.out.print("20" + year + "년도 국어과목 신청자입니다.");
			break;

		case 'E':
		case 'e':
			System.out.print("20" + year + "년도 영어과목 신청자입니다.");
			break;

		default:
			System.out.println("다시 입력하세요.");
			break;
		}
		s.close();
	}

}
/*
 * 학습코드를 입력 학습 코드는 20M456, 22K123, 23E447 
 * 앞 2개 숫자는 신청년도 세 번째 문자는 과목 
 * M : 수학, K : 국어, E : 영어(switch)
 * ex) 22K123 -> 2022년도 국어과목 신청자입니다.
 * 
 * switch, substring, charAt활용
 */