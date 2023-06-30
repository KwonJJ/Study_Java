package sec02.exam03;

import java.util.Scanner;

public class 응용문제03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("건물의 높이를 입력 : ");
		int a = s.nextInt();

		System.out.print("건물의 최대 거주 인원을 입력 : ");
		int b = s.nextInt();
		
		int c = 5 * a;
		int d = b / 3;
		System.out.println("입력하신 건물은 전체 " + c + "m이고 최대거주인원은 " + d + "명입니다.");
		
		s.close();
	}

}
/*
 * 한 층의 높이가 5미터 일 때, 건물이 몇 층인지 입력받아 높이와 최대 거주 인원을 출력
 * ex) 사용자가 35 일 때 높이는 35 * 5 = 175m, 최대거주인원은 175/3 = 58명
 * 
 * 입력하신 건물은 전체 175m이고 최대거주인원은 58명입니다.
 */