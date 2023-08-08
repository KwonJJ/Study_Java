package problem;

import java.util.*;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		
		System.out.println("학점을 6번 입력");
		System.out.println("A B C D F 중 선택해서 한 칸 띄우고 입력");
		
		for(int i = 0; i < 6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}
		
		double sum = 0;
		double avg = 0 ;
		
		for(int i = 0; i < list.size(); i++) {
			switch(list.get(i)) {
			case 'a' :
			case 'A' : 
				sum += 4.0;
				break;
				
			case 'b' :
			case 'B' :
				sum += 3.0;
				break;
				
			case 'c' : 
			case 'C' :
				sum += 2.0;
				break;
				
			case 'd' : 
			case 'D' : 
				sum += 1.0;
				break;
				
			case 'f' : 
			case 'F' :
				break;
			}
			
		}
		avg = sum / 6;
		System.out.println("평균 점수는 " + avg + "점 입니다.");
	}

}
/* 
 * Scanner클래스 사용하여 학점(A, B, C, D, F)를 6번 문자로 입력받아
 * ArrayList에 저장하고, ArrayList를 검색하여 학점을
 * 점수(A = 4.0, B = 3.0, C = 2.0, D = 1.0, F = 0)로 변환하여
 * 평균 출력하는 프로그램
 */