package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//연습 1
		/*System.out.println("숫자 하나를 입력하세요 : ");
		int n = s.nextInt();
		System.out.println("연산자(+,-)를 입력하세요 : ");
		String o = s.next();

		if (o.equals("+")) {
			n++;
		} else {
			n--;
		}
		System.out.println(n);*/
		
		//연습2
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int n = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int n1 = s.nextInt();
		
		int sum = n + n1;
		String result = (sum >= 50) ? "통과" : "탈락"; //문자열로 출력
		System.out.println(result);
	}

}

/* <연습1>
 * 만약 연산자가 +면 입력한 숫자에서 1을 증가시켜 출력하고 
 * 연산자가 -면 입력한 숫자에서 1을 감소시켜 출력하세요.
 * 
 * <연습2>
 * 삼항 연산자를 사용하여 두 수의 합이 50이상이면 "통과"
 * 50미만이면 "탈락"을 출력하시오
 */
