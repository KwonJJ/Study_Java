package sec02;

public class 브레이크예제01 {

	public static void main(String[] args) {
		while(true) {
			int n = (int) (Math.random() * 6) + 1; // 1 ~ 6까지 랜덤 숫자 추출
			System.out.println(n);
			
			if(n == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
