package sec02;

public class 브레이크예제03 {

	public static void main(String[] args) {
		
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) { //A부터 Z까지 1씩 증감
			for(char lower = 'a'; lower <= 'z'; lower++) { //a부터 z까지 증감(A-a, A-b, A-c, ..., B-a, B-b,...Z-z식으로 26 * 26으로 됨
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}
}
/* Outter를 안쓰고 for만 했을 시 모든 대문자 알파벳 A ~ Z마다 소문자g가 나올때까지 반복함
 * Outter를 써야 A-a부터 A-g까지만 출력되고 프로그램 종료됨.
*/