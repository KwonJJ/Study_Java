package test;

import java.util.Scanner;

public class 확인문제02re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 수 :  ");
		String Sn1 = s.next();
		
		System.out.println("두 번째 수 : ");
		String Sn2 = s.next();
		
		
		if(Sn1.equals(Sn2)) { //문자열 비교(Sn1과 equals괄호 안의 변수와 비교)
			System.out.println("두 수가 같아요.");
		}else {
			System.out.println("두 수가 달라요.");
		}
		
		s.close();
	}

}
/*  첫 번째 수와 두 번째 수가 같으면 두 수가 같아요
 *  첫 번째 수와 두 번째 수가 다르면 두 수가 달라요
 *  문자열 비교시 equapls 사용
 */
