package problem;

import java.util.*;

public class BigNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();

		while (true) {
			System.out.print("정수 입력 : ");
			int n = s.nextInt();
			if (n == -1) {
				break;
			}
			list.add(n);
		}

		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("가장 큰 수 = " + max);

	}

}
/* 
 * Scanner클래스로 -1이 입력될 때까지 양의 정수를 입력받아
 * 벡터에 저장하고 벡터를 검색해 가장 큰 수를 출력하는 프로그램 작성
 */