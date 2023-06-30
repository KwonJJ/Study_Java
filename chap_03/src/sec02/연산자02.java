package sec02;

import java.util.Scanner;

public class 연산자02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("x값 입력 : ");
		int x = s.nextInt();

		System.out.println("y값 입력 : ");
		int y = s.nextInt();

		System.out.println("증감기호(+ or -) 입력 : ");
		String f = s.next();

		if (f.equals("+")) { //문자열 비교 형식 = 문자열변수.equals("비교할문자열")
			x++;
			System.out.println(x);
		} else {
			y--;
			System.out.println(y);
		}
		s.close();
	}

}
/*
 * Scanner이용 x의 초기값을 입력 : 
 * y의 초기값을 입력 : 
 * 증감 기호를 입력(+, -) :
 *  
 * 만약 증감 기호가 +라면 x = x값 1
 * 증가시켜서 출력 만약 증감 기호가 -라면 x = y값 1 감소시켜서 출력
 */
