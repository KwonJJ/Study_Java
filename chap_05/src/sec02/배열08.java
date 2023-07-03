package sec02;

import java.util.Scanner;

public class 배열08 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
		System.out.println("로또 몇 게임을 하시겠습니까?");
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			int[] lotto = new int[6]; //로또 번호 개수 설정
			for(int j = 0;j < lotto.length; j++) {
			lotto[j] = (int)(Math.random() * 45) + 1; //로또 번호 숫자 추출
			System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		

	}
}
/*
 * 로또 몇 게임을 하시겠습니까? 
 * 사용자가 입력한 숫자만큼 로또 번호를 랜덤으로 출력 
 */
