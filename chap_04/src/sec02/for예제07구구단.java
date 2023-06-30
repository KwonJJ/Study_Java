package sec02;

import java.util.Scanner;

public class for예제07구구단 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단 단수 입력 : ");
		int n1 = s.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			int x = n1 * i;
			System.out.printf("%d X %d = %d\n",n1, i, x);
		}
		s.close();
	}
}
/*
 * for사용
 * 구구단 4단
 */