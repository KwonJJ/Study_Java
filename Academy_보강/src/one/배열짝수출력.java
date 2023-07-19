package one;

import java.util.Scanner;

/* 
 * <1차원 배열 생성 방법>
 * 1. int[] num = new int[5];
 * 2. int[] num2 = {1,2,3,4,5};
 */

public class 배열짝수출력 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];

		System.out.print("정수를 10개 입력 >> ");

		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}

		System.out.print("짝수는 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
/*
 * 정수 10개 입력받아 배열에 저장하고 배열에 있는 정수 중 짝수만 출력
 * ex.
 * 정수를 10개 입력하세요 : 1 5 99 22 345 154 2346 55 32 85
 * 짝수는 : 22 154 2346 32
 */