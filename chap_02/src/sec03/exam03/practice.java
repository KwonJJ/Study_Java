package sec03.exam03;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("액수를 입력하세요 : ");
		int a = s.nextInt();
		
		System.out.println("오만원권" + a / 50000 + "장");
		a = a % 50000;
		System.out.println("만원권" + a / 10000 + "장");
		a = a % 10000;
		System.out.println("천원권" + a / 1000 + "장");
		a = a % 1000;
		System.out.println("오십원 동전" + a / 50 + "개");
		a = a % 50;
		System.out.println("십원 동전" + a / 10  + "개");
		a = a % 10;
		
		s.close();
		
	}

}
