package sec01;

import java.util.Scanner;

public class switch_practice02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:                                // 모두 해당이 안되는 경우
			System.out.println("기타");
			break;
			
		}
		s.close();
	}

}