package sec02;

import java.util.Scanner;

public class for예제05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("30이하 정수 입력1 : ");
		int n1 = s.nextInt();

		System.out.println("30이하 정수 입력2 : ");
		int n2 = s.nextInt();

		int large = 0;
		int small = 0;

		// small에는 작은숫자, large에는 큰 숫자가 들어가게 됨(바꿔치기)
		if (n1 > n2) { // n1이 n2 미만이면
			large = n1; //큰 수에 n1
			small = n2; //작은 수에 n2
		} else { 
			large = n2; //큰 수에 n2
			small = n1; //작은 수에 n1
		}

		int sum = 0;

		for (int i = small; i <= large; i++) { //i에 작은 수 대입, i가 큰 수 이하면, i를 1씩 증감
			sum += i; //작은 수를 큰 수가 될 때까지 1씩 +
			
			if(i == large) { //i가 큰 숫자까지 왔다면(조건)
				System.out.printf("%d = %d",i, sum); //끝 결과값
			}else {
				System.out.printf("%d + ", i); //작은 수부터 입력한 큰 수까지 반복 출력
			}
		}
		s.close();
	}
}
/*
 * for사용
 * 30 이하의 다른 정수 2개를 입력 
 * 두 수 사이의 총 합을 출력하는 프로그램
 */