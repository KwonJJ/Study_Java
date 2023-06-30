package practice;

import java.util.Scanner;

public class for별입력 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("별의 개수 입력 : ");
		int n1 = s.nextInt();
		
		for(int i = 1; i <= n1; i++) { //줄의 개수
			for(int j = 1; j <= i; j++) { //별의 개수
					System.out.print("*");
			}
			System.out.println("");
		}
	}

}
