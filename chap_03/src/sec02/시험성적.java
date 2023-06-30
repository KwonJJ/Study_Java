package sec02;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 이름은? ");
		String name = s.next();
		
		System.out.println("접속 비밀번호를 입력해 주세요 : ");
		String password = s.next();
		char q = password.charAt(0);
		char w = password.charAt(1);
		
		
		/* 비밀번호는 소문자 영어와 숫자의 조합 ex) a5, b7
		 * 사용자가 비밀번호를 제대로 입력했으면 환영합니다. 출력
		 * 사용자가 비밀번호를 틀리게 입력했으면
		 * 비밀번호는 영어 소문자와 숫자의 조합입니다. 안내문 출력
		 */
		
		if((q >= 97) && (q <= 122) && (w >= 48) && (w <= 57)) {
			System.out.println(name + "님 환영합니다.");
		}else {
			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다");
		}
		
		/* 중간고사가 80점 이상이거나 기말고가사 80점 이상이면 "통과"
		 * 아니면 "탈락"
		 */
		System.out.println("중간고사 성적 입력 : ");
		int x = s.nextInt();
		System.out.println("기말고사 성적 입력 : ");
		int y = s.nextInt();
		
		if((x >= 80) || (y >= 80)) {
			System.out.println("통과");
		}else {
			System.out.println("탈락");
		}
		s.close();
	}

}
