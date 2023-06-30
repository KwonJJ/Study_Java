package sec02;

public class 확인문제06 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // 전체 반복 횟수는 4회(총 4줄 출력)
			for (int q = 4; q >= i; q--) {
				System.out.print(" "); // 공백 옆으로 출력
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // *을 옆으로 출력
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