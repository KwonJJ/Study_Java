package sec03.exam02;

import java.util.Scanner;

public class 실수타입변환예제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력하세요 : ");
		int a = s.nextInt();
		
		System.out.println("두 번째 숫자 입력하세요 : ");
		int b = s.nextInt();
		
		
		double result =(double) a / (double)b; //int의 값을 double로 변환(변수에 한번만 변환 값을 줘도 가능함)
		
		System.out.println("입력한 두 수의 나누기 결과는 " + result + " 입니다.");
		
		s.close();
	}

}

/*
 * 사칙연산 +, -, *, /
 * 5/2 = 2.5
 * 
 * 중간고사 성적을 입력하세요.(50점 만점)
 * ex) 34.8
 * 기말고사 성적을 입력하세요.(50점 만점)
 * ex) 24.7
 * 출력 -> 최종 점수는 59.5입니다.
 * */
