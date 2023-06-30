package sec02;

import java.util.Scanner;

public class 배열05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열 개수 입력 : ");
		int arrayN = s.nextInt();
		int sum = 0;
		double avg = 0;
		
		int[] n1 = new int[arrayN]; //사용자가 입력한 숫자로 배열 개수 생성
		
		for(int i = 0; i < arrayN; i++) { //배열은 0부터 시작하기 때문에 이하로 하면 1이 +됨.
			n1[i] = i + 1;
			sum += n1[i];
		}
		System.out.printf("합계 = %d입니다.\n", sum);
		
		for(int j = 0; j < arrayN; j++) {
			sum += n1[j];
			avg = (double) sum / arrayN;
		}
		System.out.printf("평균 값 = %3.1f입니다.", avg);
		
	}

}
/* 
 * 1. for문을 이용해 배열에 숫자 1부터 사용자가 입력한 숫자만큼 데이터 추가
 * 2. 입력된 데이터의 평균값 출력
 */
