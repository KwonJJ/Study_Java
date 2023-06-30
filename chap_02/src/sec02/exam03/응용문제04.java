package sec02.exam03;

import java.util.Scanner;

public class 응용문제04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = s.next();

		System.out.print("나이 입력 : ");
		int age = s.nextInt();

		if (age < 20) {
			System.out.println(name + "은 청년입니다.");
		} else {
			System.out.println(name + "은 장년입니다.");
		}
		s.close();

	}

}
/*
 * 이름과 나이를 입력 만약 나이 20살 미만이면 "청년" or "장년" 이름 = String name = s.next(); -> 이름 입력
 * 
 * if(age < 20) 출력 예제) 이름이 홍길동이고 나이가 15살 이면 -> 홍길동님은 청년입니다.
 */
