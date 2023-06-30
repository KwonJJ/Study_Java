package sec01;

import java.util.Scanner;

public class IF_practice02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("첫 번째 숫자는?");
		int num1 = s.nextInt();
		System.out.println("두 번째 숫자는?");
		int num2 = s.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫 번째 숫자가 큽니다.");
		}
		if (num1 < num2) {
			System.out.println("두 번째 숫자가 큽니다");
		}
		if (num1 == num2) {
			System.out.println("두 숫자가 같습니다.");
		}
		s.close();
	}

}