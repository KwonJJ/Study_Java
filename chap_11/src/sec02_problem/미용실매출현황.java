package sec02_problem;

import java.util.Calendar;
import java.util.Scanner;

public class 미용실매출현황 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calendar now = Calendar.getInstance();

		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);

		System.out.print("사용자 이름 입력 : ");
		String name = s.next();

		System.out.print("미용실 이용 목록 입력 : ");
		String use = s.next();
		System.out.println();

		int cost = 0;

		switch (use) {
		case "커트":
			cost = 8000;
			break;

		case "파마":
			cost = 20000;

			break;
		case "염색":
			cost = 25000;
			break;

		case "매직펌":
			cost = 60000;
			break;
		}
		if (hour < 12 && amPm == 0) {
			cost *= 0.7;
		} else if (hour < 6 && amPm == 1) {
			cost *= 0.9;
		}
		System.out.println(name + "님의 결제금액은 " + cost + "원 입니다.");
	}
}
/* 
 * 전대 미용실 매출 현황사용
 * 
 * 사용자 이름 입력, 
 * 미용실 이용 목록 입력 
 * 커트(8,000원),
 * 파마(20,000원),
 * 염색(25,000원),
 * 매직펌(60,000원)
 * 
 * 만약 방문시간이 오전이면 30%할인
 * 방문 시간이 낮 12 ~ 밤 6시 10% 할인
 * 나머지 할인 X
 * 
 * ex. 홍길동 파마
 * '홍길동님의 결제 금액은 18,000원 입니다'
 * 출력
 */