package sec01;

import java.util.Scanner;

public class 문자열비교 {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("두 데이터 참조가 같아요.");
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		String b = s.next();
		
		if(a == b) {
			System.out.println("두 데이터 참조가 같아요.");
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("두 데이터 참조가 같아요.");
		} else {
			System.out.println("두 데이터 참조가 달라요");
		}
		
		String q = null;
/*
 * == -> 번지수 비교
 * equals() -> 문자 자체를 비교
 *
 * String변수 초기값으로 null대입
 * 이때 null은 String변수가 참조하는 객체가 없음을 의미
 * ex) String hobby = null;
 * 
 * 참조를 잃은 String 객체는 쓰레기 수집기를 통해 메모리에서 자동 제거
 * ex) String hobby = "여행";
 * hobby = null;
 */
	}

}
