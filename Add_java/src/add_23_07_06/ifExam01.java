package add_23_07_06;

import java.util.Scanner;

public class ifExam01 {

	public static void main(String[] args) {
		int n1 = 10;
		/*
		 * 만약 n1값이 8이상이라면 "상품" 출력, 아니면 "하품"출력
		 */
		
		if(n1 >= 8) {
			System.out.println("상품");
		} else {
			System.out.println("하품");
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("출전 가수 이름은 무엇인가요?");
		String name = s.next();
		
		System.out.println("가수의 평점은 몇 점인가요?");
		int point = s.nextInt();
		
		/*
		 * 평점이 8점 이상이면 "최상급" 5점 이상이면 "중급" 나머지 "하급"
		 */
		String grade;
		
		if(point >= 8) {
			grade = "최상급";
		}
		else if(point >= 5) {
			grade = "중급";
		}
		else {
			grade = "하급";
		}	
		
		System.out.printf("%s 님의 등급은 %s입니다.\n", name, grade);
	}

}
