package sec02;

public class for중첩02별 {

	public static void main(String[] args) {
		for(int q = 1; q <= 5; q++) { //줄 개수(줄 수 q(1)부터 시작해서 5이하까지 1씩 증감
			for(int w = 5; w >= q; w--) { //별 개수(별 수 w(5)부터 시작해서 q(1)보다 크거나 같을 때까지 1씩 감소
				System.out.print("*");
			}
			System.out.println(); 
		}
	}

}
