package sec03.exam02;

import java.util.Scanner;

public class 실수타입변환예제01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("중간고사 성적을 입력하세요. ");
		Double a = s.nextDouble();
		
		System.out.println("기말고사 성적을 입력하세요. ");
		Double b = s.nextDouble();
		
		
		Double result = a + b;
		
		System.out.println("최종 점수는 " + result + " 입니다.");
		
		s.close();
	}

}

/*
 * 중간고사 성적을 입력하세요.(50점 만점)
 * ex) 34.8
 * 기말고사 성적을 입력하세요.(50점 만점)
 * ex) 24.7
 * 출력 -> 최종 점수는 59.5입니다.
 * */
