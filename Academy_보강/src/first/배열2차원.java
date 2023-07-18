package first;

public class 배열2차원 {

	public static void main(String[] args) {
		int[][] num = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
/*
 * 2차원 배열 출력 프로그램
 * ex)
 * 1
 * 1 2 3
 * 1
 * 1 2 3 4
 * 1 2
 */


/* 
 * <1차원 배열 생성 방법>
 * 1. int[] num = new int[5];
 * 2. int[] num2 = {1,2,3,4,5};
 */