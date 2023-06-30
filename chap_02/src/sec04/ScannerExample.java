package sec04;

import java.util.Scanner;

/*System.in.read()의 단점
 * 2개 이상 키가 조합된 한글 읽을 수 없음
 * 키보드로 입력된 내용을 통문자열로 읽을 수 없음
 * 
 * Scanner로 해결(System.in.read()의 단점 보완)
 * 자바가 제공하는 Scanner 클래스를 이용하면 입력된 통문자열을 읽을 수 있음
 */

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); //.nextLine -> next()와 nextLine 두 개의 큰 차이는 없으나
			//next() = 문자열 입력(띄어쓰기 사용불가)
			//nextLine() = 문자 입력(띄어쓰기 사용가능)
			System.out.println("입력된 문자열 : \"" +inputData + "\""); // \특수문자 = 특수문자 출력
			if(inputData.equals("q")) { //문자열 비교는 equals를 사용해 비교(숫자 비교는 )
				break;
			}
		}
		System.out.println("종료");
		scanner.close();
	}

}
