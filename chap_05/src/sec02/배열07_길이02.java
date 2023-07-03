package sec02;

import java.util.Scanner;

public class 배열07_길이02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("배열의 개수 입력 : ");
		int n1 = s.nextInt();
		int[] scores = new int[ n1 ];
		//입력받은 숫자로 배열 개수 생성
		//배열 새로 생성할 때 new 변수형태[변수명] 써줘야함.
		
		for(int j = 0; j < scores.length; j++) {
			System.out.printf("%d번 째 숫자를 입력하세요.", j+1); 
			//숫자 입력 출력문(+1을 한 이유는 배열은 0부터 시작이기 때문)
			int n2 = s.nextInt();
			scores[j] = n2;
		}

		int sum = 0;

		for (int i = 0; i < scores.length; i++) { // 배열 길이 -> 배열변수.length
			sum += scores[i];
		}
		System.out.printf("총합 = %d", sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 = " + avg);
	}

}
/* 
 * 배열의 개수 입력 (Scanner 통해 입력 받음) 
 * 입력받은 개수만큼 반복문으로 숫자 입력
 * 해당 숫자들의 합계와 평균을 출력 
 */