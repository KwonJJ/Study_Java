package sec01;

import java.util.Scanner;

public class SwitchCharExample01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("사용자 코드를 입력 : "); // ex) A115, B113, C119, a115, b113, c119
		String code = s.next();
		
		char a = code.charAt(0);
		
		switch(a) {
			case 'A' :
			case 'a' :
				System.out.println("인사부에 배정되셨습니다.");
				break;
				
			case 'B' :
			case 'b' :
				System.out.println("기획부에 배정되셨습니다.");
				break;
				
			case 'C' :
			case 'c' :
				System.out.println("총무부에 배정되셨습니다.");
				break;
				
			default :
				System.out.println("다시 입력하세요.");
				break;	
		}
		
		s.close();
	}

}
/* switch문 사용
 * 영어가 a(A)라면 "인사부에 배정되셨습니다."출력
 * 영어가 b(B)라면 "기획부에 배정되셨습니다."출력
 * 영어가 c(C)라면 "총무부에 배정되셨습니다."출력
 */