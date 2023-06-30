package sec02;

public class 확인문제06re {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {     // 전체 반복 횟수는 4회(총 4줄 출력)
			for (int q = 4; q >= 1; q--) { // 옆으로 출력되는 공백 개수(4부터 시작해서 1이 될때까지 1씩 감소)
				if(i < q) {                // 전체 줄수(i)가 옆으로 출력되는 공백 새수(q)보다 작을시 실행하는 조건
					System.out.print(" "); // 공백 옆으로 출력
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); // 줄 변경
		}
	}

}
/* 
 *  for문을 이용해서
 *      *
 *     **
 *    ***
 *   ****
 *   를 출력   
 */