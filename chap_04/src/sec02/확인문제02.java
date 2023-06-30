package sec02;

public class 확인문제02 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) { //만약 3의 배수라면
				sum += i;    //3의 배수를 모두 더함
			}
			
			if(i % 3 != 0) { //만약 3의 배수가 아니라면
				continue;   //생략
			}
			sum1 += i;
		}
		System.out.printf("1 부터 100까지 숫자 중 3의 배수의 합계 = %d \n", sum);
		System.out.printf("1 부터 100까지 숫자 중 3의 배수의 합계 = %d \n", sum1);
	}

}
/* for문을 이용해서 1부터 100까지의 정수 중에서
 * 3의 배수의 총합을 구하는 코드 작성
 */
