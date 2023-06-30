package sec01;

import java.util.Scanner;

public class switchpractice02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int time = (int)(Math.random() * 4) + 8; // 4개의 숫자 랜덤 생성(8 ~ 11)
		System.out.println("현재 시각 : " + time + "시");
		
		switch(time) {
		case 8 : 
			System.out.println("출근합니다.");
			break;
			
		case 9 :
			System.out.println("회의를 합니다.");
			break;
			
		case 10 : 
			System.out.println("업무를 봅니다.");
			break;
			
		default :
			System.out.println("외근을 나갑니다.");
			break;
		}
		s.close();
	}

}
/* int타입의 변수 time의 초기값으로 8 ~ 11 중에서 하나의 수를 무작위로 뽑고, 선언과 동시에 초기화 
 * 각 시각에 정해둔 문구를 출력
 * switch문 사용
 * 
 * ex) <문구내용>
 * 8 : "출근합니다"
 * 9 : "회의를 합니다."
 * 10 : "업무를 봅니다."
 * 그 외 : "외근을 나갑니다."
 * 
 * 실행결과
 * [현재 시각 : 9시]
 * 회의를합니다.
 */