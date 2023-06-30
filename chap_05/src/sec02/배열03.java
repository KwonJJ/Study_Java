package sec02;

public class 배열03 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		// int scores[] = {83, 90, 87}; 압축해서 사용 가능함.

		int sum1 = 0;

		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 = " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 }); // add라는 메소드를 호출(메인구문 밖에서 add를 찾음)
		System.out.println("총합 = " + sum2);
		System.out.println();
	}

	public static int add(int[] scores) { //결과값이 int타입으로 나와서 int num2에 대입되니 int값을 줘야함
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
/* 
 */