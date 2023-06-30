package sec02;

import java.util.Scanner;

public class for누적합계 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 입력(1 ~ 100) : ");
		int n = s.nextInt();
		int sum = 0; //초기화를 해줘야 정수 계산 가능
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합계 = %d입니다.", n, sum);
		
		s.close();
	}

}
/* 사용자로부터 숫자 입력(1 ~ 100사이) int
 * 1부터 사용자가 입력한 숫자까지의 합계 구하기
 * for문 사용
 * 
 * 출력 -> 1부터 ~까지의 합계 = ~입니다.
 */