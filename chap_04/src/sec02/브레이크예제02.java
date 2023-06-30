package sec02;

public class 브레이크예제02 {

	public static void main(String[] args) {
		
		do {
			int n = (int) (Math.random() * 6) + 1; // 1 ~ 6까지 랜덤 숫자 추출
			System.out.println(n);
			
			if(n == 6) {
				break;
			}
		} while(true);	
		System.out.println("프로그램 종료");
	}
}
/* for -> 반복 횟수가 정확할 때 사용 
 * while -> 반복 횟수를 모를 때 사용
 * do while -> 
 */
