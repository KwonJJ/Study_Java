package sec06;

import java.util.Scanner;

public class StudentExam02 {

	public static void main(String[] args) {
		Student02 stu = new Student02();
		Scanner s = new Scanner(System.in);

		boolean run = true;

		while (run) {
			boolean check = stu.checkLogin(); // 로그인 점검 메소드 작성

			if (check) { // 로그인 되었다면 로그아웃(종료), 성적입력 처리
				System.out.println("작업을 선택해 주세요.");
				System.out.println("1번은 로그아웃, 2번은 성적 입력");
				int choice = s.nextInt();

				if (choice == 1) {
					run = false; // 1을 입력했을 때 종료시킴
				} else if (choice == 2) {
					stu.inputExam(); // 성적 입력 메소드 작성
					run = false;
				} else {
					System.out.println("다시 입력하세요.");
				}
			}
		}
	}

}
