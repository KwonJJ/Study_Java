package problem02;

import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		
		Grade me = new Grade(math, science, english);
		// 필드 3개(private), 생성자 1개(매개변수 3개짜리), 메소드 4개
		
		System.out.println("평균은 " + me.average() + "점입니다.");
		//average()는 평균을 계산하여 리턴
	}

}
/*
 * Grade클래스 만들어서 출력
 */
