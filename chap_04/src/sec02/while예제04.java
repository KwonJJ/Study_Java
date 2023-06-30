package sec02;

import java.util.Scanner;

public class while예제04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//System.out.println("숫자 하나를 입력(1 ~ 10) : ");
		//int userN = s.nextInt();

		//int comN = (int) (Math.random() * 10) + 1; // 1 ~ 10 중 랜덤으로 숫자 추출

		/*
		if (userN == comN) {
			System.out.println("정답입니다.");
			System.out.println("사용자 입력 : " + userN);
			System.out.println("컴퓨터 숫자 : " + comN);
		} else {
			System.out.println("오답입니다.");
			System.out.println("사용자 입력 : " + userN);
			System.out.println("컴퓨터 숫자 : " + comN);
		}
		*/

		int comN = (int) (Math.random() * 20) + 1; // 1 ~ 20 중 랜덤으로 숫자 추출
		int userN;
		
		while (true) {
			System.out.println("숫자 하나를 입력(1 ~ 20) : " );
			userN = s.nextInt();
			
			if (userN == comN) {
				System.out.println("정답입니다.");
				break;
			} else if (userN > comN) {
				System.out.println("입력한 수가 더 큽니다. 작은 수를 입력하세요.");
			} else {
				System.out.println("입력한 수가 더 작아요. 큰 수를 입력하세요.");
			}
		}

		s.close();
	}

}
