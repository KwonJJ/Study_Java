package sec01;

import java.util.Scanner;

public class IF_practice03 {

	public static void main(String[] args) {
		// int 타입의 변수 score을 선언하고 키보드로 값을 입력 받으세요. (if문 사용)
		// 만약 score가 50 이상이면 합격, 50 미만이면 재시험입니다. 
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수: ");
		int score = s.nextInt();
		
		if (score >= 50) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("재시험을 보세요.");
		}
		s.close();
	}

}