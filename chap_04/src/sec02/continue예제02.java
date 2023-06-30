package sec02;

public class continue예제02 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0 || i % 5 != 0) { //3의 배수가 아니거나 5의 배수가 아닐 때 출력 생략
				continue;
			}
			System.out.println(i);
		}
	}

}
/* 1부터 100까지 숫자 중 3의 배수이면서 5의 배수인 숫자만 출력
 * continue활용
 * 
 * continue : 특정 조건을 만족하는 경우 continue문을 실행해서 그 이후 문장을 실행하지 않고 다음 반복으로 넘어갈 때 사용.
 */
