package test;

import java.util.Scanner;

public class 확인문제01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 이름은? ");
		String name = s.next();
		
		System.out.println("당신의 나이는? ");
		int age = s.nextInt();
		
		System.out.println("당신의 휴대폰 번호 가운데 4자리는? ");
		String mid = s.next();
		
		System.out.println("당신의 휴대폰 번호 끝 4자리는? ");
		String end = s.next();
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n"); //println과 같지만 줄바꿈이 없음(옆으로 길게<줄바꿈 없이> 출력하고 싶을 때 사용)
		System.out.printf("전화 : 010 - %s - %s", mid, end);
		
		s.close();
	}

}
/* Scanner 활용
 * 당신의 이름은? -> string
 * 당신의 나이는? ->int
 * 당신의 휴대폰 번호 가운데 4자리는? -> string
 * 당신의 휴대폰 번호 끝 4자리는? -> string
 */
