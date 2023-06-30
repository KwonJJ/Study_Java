package sec02;

public class while예제02 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 1;
		
		while(n2 <= 9) { //while는 조건식만 넣을 수 있음(변수 선언 안됨) (n2가 9이하일 때까지 조건)
			int x = n1 * n2; //x에 5단 결과 저장
			System.out.printf("%d X %d = %d\n", n1, n2, x);
			n2++; //n2가 9이하가 될 때까지 1씩 증감
		}
	}

}
/* 
 * while 이용해서 구구단 5단 출력
 */