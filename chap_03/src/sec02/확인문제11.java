package sec02;

import java.util.Scanner;

public class 확인문제11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("관리자 접속코드 입력 : ");
		String code = s.next();
		String admin_id = code.substring(0, 3); //0 부터 3이전까지만 분리
		int admin_pass = Integer.parseInt(code.substring(3, 7)); //3부터 7이전까지 분리

		System.out.println("ID : ");
		String name = s.next();

		System.out.println("PW : ");
		String pass = s.next();
		int password = Integer.parseInt(pass);

		if (name.equals(admin_id)) {
			if (password == admin_pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}
		s.close();
	}

}
/*
 * 아이디와 패스워드 입력 입력 조건 : 이름은 문자열, 패스워드는 정수(패스워드는 int 타입으로 변환) 
 * ex) 아이디가 "java"이고 패스워드가 12345라면 
 * "로그인 성공"을 출력, 그렇지 않으면 "로그인 실패"를 출력
 * 
 * 관리자 접속코드를 입력하세요 (문자열 분리) 
 * ex) 홍길동1234 
 * ID : 홍길동 
 * PW : 1234 
 * "로그인 성공"
 * 
 * 홍길동1234 
 * ID : 홍길동 
 * PW : 1235 
 * "비밀번호가 틀림"
 * 
 * 홍길동1234 
 * ID : 장동건 
 * PW : 1234 
 * "아이디가 존재하지 않음"
 */