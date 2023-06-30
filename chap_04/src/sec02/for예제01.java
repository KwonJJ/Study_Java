package sec02;

public class for예제01 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++/* (i++을 i += 2(2씩 증가)로 해도 홀수로 가능)*/) { //for(int i = 10; i >= 1; i--)로도 홀수 가능
			if (i % 2 == 1) { //1, 3, 5, 7, 9 홀수 조건
				sum += i;
			}
		}
		System.out.println("1 ~ 10의 합 : " + sum);
	}

}
