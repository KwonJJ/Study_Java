package sec02;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생수 입력 : ");
		int n1 = s.nextInt();
		
		System.out.println("연필 개수 입력 :");
		int n2 = s.nextInt();
		
		int result = n2 / n1;
		int result1 = n2 % n1;
		
		System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남음", result, result1);
		
		s.close();
		
	}

}

/* 학생수 입력
 * 연필 개수 입력
 * 
 * 학생들에게 연필 나눠주고 싶음
 * 학생 수 10명이고 연필수 33개이면
 * 한명 당 3개씩 3개가 남음
 * 
 * 출력문) 학생 한 명 당 ?개씩 연필을 가져가고 ?개가 남음.
 * */
