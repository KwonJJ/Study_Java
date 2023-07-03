package sec02;

public class 배열07_길이01 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) { // 배열 길이 -> 배열변수.length
			sum += scores[i];
		}
		System.out.println("총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 = " + avg);
	}

}
