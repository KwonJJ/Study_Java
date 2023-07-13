package add_23_07_06;

import java.util.Scanner;

public class select {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String choice[] = { "가위", "바위", "보" };

		while (true) {
			System.out.println("가위 바위 보 중 하나 입력 : ");
			System.out.println("그만 입력하면 종료");
			String input = s.next();

			int random = (int) (Math.random() * 3);

			if (input.equals("그만")) {
				System.out.println("종료");
				break;
			} else if (input.equals(choice[random])) {
				System.out.println("비겼습니다.");
			} 
			
			else if (input.equals("가위")) {
				if (random == 1) { // 컴퓨터 : 바위
					System.out.println("사용자 : 가위");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 졌습니다.");
				} else {
					System.out.println("사용자 : 가위");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 이겼습니다.");
				}
			} 
			
			else if (input.equals("바위")) {
				if (random == 2) { // 컴퓨터 : 보
					System.out.println("사용자 : 바위");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 이겼습니다.");
				} else {
					System.out.println("사용자 : 바위");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 졌습니다.");
				}
			} 
			
			else if (input.equals("보")) {
				if (random == 0) { // 컴퓨터 : 가위
					System.out.println("사용자 : 보");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 졌습니다.");
				} else {
					System.out.println("사용자 : 보");
					System.out.println("컴퓨터 : " + choice[random]);
					System.out.println("사용자가 이겼습니다.");
				}
			}

		}

	}

}
/*
 * 컴퓨터와 사용자가 가위 바위 보 게임을 합니다. 사용자가 가위 바위 보 중 하나를 선택 컴퓨터는 가위 바위 보 중에서 랜덤하게 하나 선택
 * 사용자 입력과 컴퓨터 선택 내용을 비교해서 누가 이겼는지 결과 출력 사용자가 가위 바위 보 대신 "그만"을 입력하면 게임이 끝남 반복,
 * 조건, 배열을 이용해서 문제 풀기
 */