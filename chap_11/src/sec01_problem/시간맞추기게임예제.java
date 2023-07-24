package sec01_problem;

public class 시간맞추기게임예제 {

	public static void main(String[] args) {

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		시간맞추기게임 enter = new 시간맞추기게임();

		String names[] = { "홍길동", "장동건" }; // 2명 배열 생성
		int time1, time2; // 시작 시간(초)와 끝 시간(초) 저장할 변수

		int times[] = new int[2]; // 2명의 지난 시간(끝 시간 - 시작 시간) 저장할 배열 생성

		for (int i = 0; i < 2; i++) {
			// 2번 반복하여 지난 시간 데이터를 배열에 저장
			System.out.print(names[i] + " 시작 <Enter>키 ");
			time1 = enter.start();

			System.out.print(names[i] + " 10초 예상 후 <Enter>키 ");
			time2 = enter.start();

			if (time1 > time2) {
				times[i] = (time2 + 60) - time1;
			} else {
				times[i] = time2 - time1;
			}

			if (times[0] > times[1] || times[1] > 10) {
				System.out.println("홍길동의 결과 " + times[0] + ", 장동건의 결과 " + times[1] + ", 승자는 홍길동");
			} else {
				System.out.println("홍길동의 결과 " + times[0] + ", 장동건의 결과 " + times[1] + ", 승자는 장동건");
			}
		}
	}
}
