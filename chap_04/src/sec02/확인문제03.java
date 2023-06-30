package sec02;

public class 확인문제03 {

	public static void main(String[] args) {

		while (true) {
			int n1 = (int) (Math.random() * 6) + 1;
			int n2 = (int) (Math.random() * 6) + 1;
			System.out.printf("주사위 숫자 1 : %d\t", n1);
			System.out.printf("주사위 숫자 2 : %d\n", n2);

			int x = n1 + n2;

			if (x == 5) {
				System.out.printf("(%d + %d) = %d입니다.",n1, n2, x);
				break;
			}
		}
	}

}
/* 
 * while, Math.random()을 이용해서 2개의 주사위를 던졌을 때
 * 나오는 눈(눈1, 눈2)형태로 출력하고
 * 눈의 합이 5가 아니면 계속 주사위를 던지고
 * 눈의 합이 5이면 실행을 멈추는 코드를 작성
 * 
 * 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)
 */
