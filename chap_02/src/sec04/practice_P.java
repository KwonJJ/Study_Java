package sec04;

import java.util.Scanner;

public class practice_P {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a;

		while (true) {
			System.out.println("도어락 비밀번호를 입력하세요 : ");
			a = s.nextLine();
			if (a.equals("1234")) {
				System.out.println("환영합니다.");
				break;
			}
			System.out.println("비밀번호가 틀렸습니다.");
		}
		s.close();
	}
}

/*
 * 도어락 비밀번호를 입력하세요 
 * 비밀번호 : 1234 
 * 만약 비밀번호를 잘못 입력했으면 -> 비밀번호가 틀립니다. 
 * 제대로 입력 했으면 -> 환영합니다.
 * 
 * equal사용하기
 */