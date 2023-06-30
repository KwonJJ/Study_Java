package sec02;

import java.util.Scanner;

public class 배열04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력 : ");
		int a = s.nextInt();

		System.out.println("두 번째 숫자 입력 : ");
		int b = s.nextInt();
		
		int[] c = new int[2]; // 2개 공간을 가진 int 배열 생성
		
		c[0] = a;
		c[1] = b;
		
		int sum = c[0] + c[1];
		
		System.out.printf("합계 = %d", sum);
		
	}

}
/*
 * new 연산자로 배열 생성
 * ex) 타입[] 변수 = new 타입[길이(개수)];
 * 
 * 배열 변수가 선언된 경우
 * ex) 타입[] 변수 = null;
 * 변수 = new 타입[길이(개수)];
 * 
 * new 연산자로 배열 처음 생성 시 배열은 자동으로 기본값으로 초기화
 * ex) int[] scores = new int[30];
 * ex) String[] names = new String[30];
 */
