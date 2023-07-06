package add_23_07_06;

import java.util.Scanner;

public class switchExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출전 가수 이름은 무엇인가요?");
		String name = sc.next();
		
		System.out.println("가수의 평점은 몇 점인가요?");
		int point = sc.nextInt();
		
		/*
		 * 평점이 8점 이상이면 "최상급" 5점 이상이면 "중급" 나머지 "하급"
		 */
		String grade;
		
		switch(point) {
			case 10 :
			case 9 :
			case 8 :
				grade = "최상급";
				break;
			
			case 7 :
			case 6 :
			case 5 :
				grade = "중급";
				break;
				
			default :
				grade = "하급";
		}
		
		
		System.out.printf("%s 님의 등급은 %s입니다.\n", name, grade);
	}

}
