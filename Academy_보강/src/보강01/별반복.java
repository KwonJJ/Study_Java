package 보강01;

import java.util.Scanner;

public class 별반복 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("정수 입력 >> ");
		int n = s.nextInt();

		for (int i = n; i >= 0; i--) {
			// 변수i에 입력한 정수 저장, 변수 i가 0보다 크거나 같을 때까지 1씩 감소시킨 후 줄 바꿈
			for (int j = i; j >= 0; j--) {
				// 변수 j에 i를 저장시키고 j가 0보다 크거나 같을 때까지 1씩 감소시킨 후 별 생성
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
 * 스캐너 이용해서 정수 입력받아 * 출력
 * ex)
 * *****
 * ****
 * ***
 * **
 * *
 */