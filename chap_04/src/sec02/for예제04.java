package sec02;

import java.util.Scanner;

public class for예제04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 입력1 : ");
		int n1 = s.nextInt();
		
		System.out.println("정수 입력2 : ");
		int n2 = s.nextInt();
		
		int temp;
		
		if(n1 > n2) { //바꿔치기를 해줘야 큰수부터 입력해도 출력됨
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for(int i = n1; i <= n2; i++) { //이것만 하면 작은수부터 입력해야 출력
			if(i % 2 == 1) {
				System.out.println(i);
			} 
		}
		s.close();
	}

}
/* 100이하의 다른 정수 2개 입력받아 홀수인 수를 작은 수 부터 큰 수 까지 출력하는 프로그램
 */