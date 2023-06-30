package sec01;

import java.util.Scanner;

public class SwitchCharExample02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("직원 코드를 입력 : ");
		String code = s.next();
		
		char part = code.charAt(0);
		String position = code.substring(1, 3);

		switch (part) {
		case 'A':
		case 'a':
			System.out.print("인사부"); //print -> 줄바꿈 없이 붙어서 출력
			break;

		case 'B':
		case 'b':
			System.out.print("기획부");
			break;

		case 'C':
		case 'c':
			System.out.print("총무부");
			break;

		default:
			System.out.println("다시 입력하세요.");
		}

		switch (position) {
		case "부장":
			System.out.println(" 부장님 보너스 금액은 1,000,000원 입니다.");
			break;

		case "과장":
			System.out.println(" 과장님 보너스 금액은 700,000원 입니다.");
			break;

		case "차장":
			System.out.println(" 차장님 보너스 금액은 500,000원 입니다.");
			break;

		default:
			System.out.println("다시 입력하세요.");
			break;
		}

		s.close();
	}

}
/* switch문 사용
 * 직원 코드는 A부장1234, B과장4567, C차장9874 
 * A = 인사부, B = 기획부, C = 총무부
 * 보너스 금액 = 부장 : 100만원, 과장 : 70만원, 차장 : 50만원 
 * ex) A부장1234 -> 인사부 부장님 보너스 금액은 1000000원 입니다. 출력
 * 
 * hint - 문자열 특정 부분 추출 -> substring(1,3) <시작 위치(1)부터 끝 위치(3)앞까지 추출>
 */