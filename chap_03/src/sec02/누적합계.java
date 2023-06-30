package sec02;

import java.util.Scanner;

public class 누적합계 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번 째 수 입력(1~20사이) :");
		int a = s.nextInt();

		System.out.println("두번 째 수 입력(1~20사이) :");
		int b = s.nextInt();
		int result = 0; 
		//숫자 초기화 = 0
		//문자 초기화 = " "
		
		while(true) {
			if(a <= b) {
				result += a;
				a++;
			}
			else {
				break;
			}
		}
		System.out.println("두 수의 누적 합계 = " + result);
		
		s.close();
	}
	/* ex) 첫 번째 숫자가 5, 두번 째 숫자가 8
	 * 5 + 6 + 7 + 8의 결과를 출력
	 */
}
