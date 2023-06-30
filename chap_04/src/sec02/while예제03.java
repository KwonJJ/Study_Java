package sec02;

import java.util.Scanner;

public class while예제03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n1 = s.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= n1) { //변수 i(1)이 사용자가 입력한 n1보다 작거나 같을 때 까지 조건
			sum += i; //변수 i(1) + 사용자가 입력한 n1까지의 수를 누적해서 더함
			i++; //i(1)을 1씩 증감
		}
		System.out.println("1 ~ " + (i - 1)/* n1로 해도 됨 */ + " 합 = " + sum); 
		/* (i - 1)을 쓴 이유는 while조건을 다 만족 시키면 
		 * 사용자가 입력한 변수 n1의 값보다 1 크게 나와서 
		 * -1을 써줘서 사용자가 입력한 수와 맞게끔 조정해줘야함.
		 * 
		 * (i - 1)은 이해를 위해 사용했고
		 * 입력한 수의 변수인 n1을 써도 괜찮음.
		 */
		
		s.close();
	}

}
/* while사용 
 * int타입의 변수 num을 선언하고 값 입력
 * 1 ~ 변수num까지 합을 출력하는 프로그램 작성
 * 
 * ex)
 * 정수 입력 : 10
 * 1 ~ 10 합 : 55
 * 
 * 정수입력 : 100
 * 1 ~ 100 합 : 5050
 * 
 * 정수입력 : 35
 * 1 ~ 35 합 : 630
 */
