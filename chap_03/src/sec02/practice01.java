package sec02;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int pay = 9620;
		
		System.out.println("근로 시간 입력 : ");
		int time = s.nextInt();
		
		double x = pay * time;
		x = (time >= 10)? x * 1.2 : x * 1.0; 
		
		System.out.println((int)x); //double값 int값으로 강제 형변환
		
		s.close();
	}

}

/* 삼항 연산자를 사용
 * (조건)?값1 : 값2
 * 
 * 사용자로부터 근로시간을 입력
 * 1시간당 9620원
 * 만약 근로시간이 10시간 이상이면
 * 임금의 1.2배를 받음
 * 
 * 총 임금을 출력
 * */
