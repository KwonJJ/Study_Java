package sec02;

public class for중첩02별re {

	public static void main(String[] args) {
		for(int q = 1; q <= 5; q++) { //줄 개수(줄 수 q(1)부터 시작해서 5이하까지 1씩 증감
			for(int w = 1; w <= q; w++) { //별 개수(별 수 w(1)부터 시작해서 q이하까지 1씩 증감
				//(별 개수)만약 w를 5라고 쓴다면 별이 5개씩 출력됨
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
	}

}
