package test;

import java.util.Scanner;

public class 확인문제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 수 :  ");
		String Sn1 = s.next();
		
		System.out.println("두 번째 수 : ");
		String Sn2 = s.next();
		
		int n1 = Integer.parseInt(Sn1); //String타입을 int타입으로 변환
		int n2 = Integer.parseInt(Sn2);
		
		int result;
		
		if(n1 > n2) {
			result = n1 - n2;
			System.out.println("뺄셈 결과 = " + result);
		} else {
			result = n1 + n2;
			System.out.println("덧셈 결과 = " + result);
		}
		
		s.close();
	}

}
/* 두 수를 입력
 * 첫 번째 수가 두 번째 수보다 크면 뺄셈 실행
 * 첫 번쨰 수가 두 번째 수보다 작으면 덧셈 실행
 * ex) 5, 3 -> 5 - 3 = 2 => 뺄셈 결과 = 2
 *     3, 5 -> 3 + 8 = 8 => 덧셈 결과 = 8
 *     
 *     
 * int a = 3;
 * int b = 5;
 * 
 * if(a == b){
 * system.out.println("두 수가 같아요")
 * } else{
 *  system.out.println("두 수가 달라요")
 *  }
 *  문자열 비교시 equapls 사용
 */