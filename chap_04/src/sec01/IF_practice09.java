package sec01;

import java.util.Scanner;

public class IF_practice09 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("상품 수량:");
		int a = s.nextInt();

		if (a >= 8) {
			System.out.println("가격은 " + (int) (a * 7000 * 0.9) + "입니다.");
		} else
			System.out.println("가격은 " + (a * 7000) + "입니다.");
		
		s.close();
	}
}
/* 10% 할인 
 * 상품 가격 7000원
 * 8개 이상 사면 10% 할인
 * 아니면 원가 
 */
