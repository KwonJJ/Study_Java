package sec02;

import java.util.Scanner;

public class 확인문제06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentN = 0;
		int[] scores = null;

		Scanner s = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(s.nextLine()); // 선택 출력문

			if (selectNo == 1) { 
				// 입력 받은 숫자만큼의 배열 생성
				System.out.print("학생수 > ");
				studentN = Integer.parseInt(s.nextLine());
				scores = new int[studentN];
			}

			else if (selectNo == 2) { 
				// 각 배열에 점수 입력
				for (int i = 0; i < scores.length; i++) { // 학생수 저장된 scores배열의 값 미만일 때까지 1씩 증감
					System.out.print("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(s.nextLine());
				}
			}

			else if (selectNo == 3) { 
				// 각 배열의 점수 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			}

			else if (selectNo == 4) { 
				// 배열에서 최고 점수와 평균 점수 출력
				int max = 0;
				int sum = 0;
				double avg = 0;

				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) { // 최대값 구하기
						max = scores[i];
					}
					sum += scores[i]; // 합계 구하기
				}
				avg = (double) sum / studentN; // 평균구하기
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);

			}

			else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
/*
 * 학생 수와 각 학생들의 점수 입력받아서
 * 최고 점수 및 평균점수 구하기
 */