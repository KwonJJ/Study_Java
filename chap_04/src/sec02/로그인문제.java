package sec02;

import java.util.Scanner;

public class 로그인문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String id = "abc";
		String pw = "1234";

		while (true) {
			System.out.print("ID 입력 : ");
			String id1 = s.next();

			System.out.print("PW 입력 : ");
			String pw1 = s.next();

			if (id1.equals(id) && pw1.equals(pw)) {
				System.out.println("환영합니다.");
				break;
			} else if (id1.equals(id) && !pw1.equals(pw)) { //문자열의 != -> !변수.equals(변수) (!연산자 붙여줘야 같지 않다라는 조건이 됨)
				System.out.println("비밀번호가 다릅니다.");
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
	}

}
/* <로그인 문제>
 * 
 * 아이디 : abc 비밀번호 : 1234로 설정
 * 
 * 사용자로부터 아이이돠 비밀번호 입력
 * 아이디는 맞지만 비밀번호가 다르면  "비밀번호가 달라요" 출력
 * 아이디가 존재하지 않으면 "아이디가 존재하지 않습니다" 출력
 * 
 * 로그인이 될 때까지 무한반복
 * 아이디, 비밀번호 모두 맞으면 "환영합니다" 출력 후 종료
 */
