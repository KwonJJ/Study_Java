package sec02;

import java.util.Scanner;

public class team {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("학생 수 입력 : ");
		int stu = s.nextInt();

		System.out.println("한 줄에 몇 명씩 앉나요? ");
		int seat = s.nextInt();

		double line1 = (double)stu / seat; //line = 남은 줄 수(남은 값) 소수점으로 
		int line2 = stu / seat;  //line2 = 앉은 줄
		
		if(line1 - line2 > 0) { //남은 줄 수(소수점 값) - 앉은 줄(정수값)이 0보다 크다면
			line1++; //남은 줄 수 1씩 증감
		}
	
	    int resultline = (int)line1; //남은 줄 수(남은 소수점) int형으로 변환
		int remainseat = resultline * seat - stu; //남은 좌석 수 = 정수값으로 변환 시킨 남은 줄 수 * 한 줄당 앉은 수 - 학생수
		System.out.printf("총 %d줄이고 남은 좌석 수는 %d입니다. ", resultline, remainseat);
		
		
		
	    /* 삼항연산자를 활용
	    double l = (double) ((line1 - line2 > 0) ? line1++ : false);
		int resultline = (int)line1;
		int remainseat = resultline * seat - stu;
		System.out.printf("총 %d줄이고 남은 좌석 수는 %d입니다. ", resultline, remainseat);
		*/
		
		s.close();

	}
}

/*
 * <팀숙제> 
 * 학생수? 한 줄에 몇 명식 앉나요?
 * 
 * 총 ?줄이고 남은 좌석 수는 ?개입니다.
 * 
 * ex)학생수 33명, 한줄 5명 = 총 7줄이고 남은 좌석수는 2개
 */