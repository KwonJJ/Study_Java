package sec04;

import java.util.Scanner;

public class PrintfPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("순번을 입력하세요 : ");
		int a = s.nextInt();
		
		System.out.println("이름을 입력하세요 : ");
		String b = s.next();
		
		System.out.println("나이를 입력하세요 : ");
		int c = s.nextInt();
		
		System.out.printf("순번 : %-3d\t 이름 : %s\t 나이 : %3d\t", a, b, c);
		
	}

}

/* 이름을 입력하세요 
 * ex) 장동건
 * 나이를 입력하세요
 * ex) 26
 * 
 * 순번   이름   나이
 * 1     장동건  26  -> \t이용해 띄우가
 * 
 * 순번 : %d 왼쪽 맞춤 자리수 3자리
 * 이름 : %s
 * 나이 : %d 오른쪽 맞춤 자리수 4자리
 */
