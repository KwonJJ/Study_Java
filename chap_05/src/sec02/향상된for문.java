package sec02;

public class 향상된for문 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int score : scores) { //반복문의 개수와 배열수가 같을 때만 먹힘
			sum += score;
		}
		/* <기존 방식>
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		 */
		System.out.printf("점수 총합 : %d\n", sum);
	}

}
