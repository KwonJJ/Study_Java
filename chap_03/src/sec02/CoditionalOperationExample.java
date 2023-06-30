package sec02;

import java.util.Scanner;

public class CoditionalOperationExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int score = 85;
		char grade = (score > 90)? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		System.out.println("점수 입력 : ");
		int sc = s.nextInt();
		char g = (sc >= 90)? '수' : ((sc >= 80)? '우' : '미');
		System.out.println("사용자의 학점 : " + g);
		
		s.close();
	}
/* 사용자가 점수를 입력
 * 점수 90점 이상 "수"
 * 점수 80점 이상 "우"
 * 나머지 "미" 
 */
}
