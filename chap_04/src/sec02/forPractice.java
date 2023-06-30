package sec02;

public class forPractice {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) { // for문은 초기값과 증가값 적용 잘 해야함.
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지의 3의 배수의 합계 : " + sum);
	}

}
