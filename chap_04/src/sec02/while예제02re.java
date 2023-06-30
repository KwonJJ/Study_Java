package sec02;

import java.util.Scanner;

public class while예제02re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단수 입력 : ");
		int x = s.nextInt();
		
		int n1 = x;
		int n2 = 1;
		
		while(n2 <= 9) { //while는 조건식만 넣을 수 있음(변수 선언 안됨) (n2가 9이하일 때까지 조건)
			x = n1 * n2;
			System.out.printf("%d X %d = %d\n", n1, n2, x);
			n2++; //n2가 9이하가 될 때까지 1씩 증감
		}
		s.close();
	}

}
/* 
 * while 이용해서 구구단 5단 출력
 */