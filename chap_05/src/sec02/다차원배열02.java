package sec02;

import java.util.Scanner;

public class 다차원배열02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String[] name = new String[3]; //배열수 3줄로 제한
		for (int i = 0; i < name.length; i++) { //이름 입력 반복
			System.out.print("이름 입력 : ");
			name[i] = s.next(); //이름의 배열 수만큼 입력
		}
		
		int[][] n = new int[3][2]; // 3줄 2칸짜리 배열
		for(int i = 0; i < n.length; i++) { //배열의 줄 수 조건
			
			int sum = 0; //사람이 바뀔 때마다 합계값 초기화

			for(int j = 0; j < n[i].length; j++) { //배열의 칸수 조건값
			
				if(j == 0) { //첫 번째 입력값이 중간고사, 두번째 값은 기말고사 조건
					System.out.printf("%s의 중간고사 점수 입력 : ", name[i]);
				} else {
					System.out.printf("%s의 기말고사 점수 입력 : ", name[i]);
				}
				n[i][j] = s.nextInt(); // i = 줄수, j = 칸수 (각 위치에 값 삽입)
				sum += n[i][j]; //각 사람의 합계값 계산
			}
			double avg = (double)sum / 2;
			System.out.printf("%s의 평균 점수는 %3.1f입니다. \n", name[i], avg);
		}

	}

}
/* 
 * Scanner이용
 * 
 * 반복문 이용해서 3명의 이름을 입력 받기
 * ex) 철수, 영희, 순희
 * 
 * int[][] num = new int[3][2]; -> 3줄 2칸짜리 배열 생성
 * 첫 번째 칸은 중간고사
 * 두 번째 칸은 기말고사 
 * 사용자로부터 시험점수를 반복문 이용해 입력 받기
 * 
 * 3명의 평균점수 출력
 * ex)
 * 철수의 평균 점수 = 57.8점
 * 영희의 평균 점수 = 88.4점
 */