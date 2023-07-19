package 보강02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int result = 0; // 계산 결과를 저장할 변수
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = s.nextInt();
		int b = s.nextInt();
		char c = s.next().charAt(0); // 세번 째로 입력한 연산자를 char 타입으로 저장
		
		Calc cal;
		/*
		 * 추상 클래스의 객체 생성
		 */
		
		switch (c) {
		case '+':
			cal = new Add(); // 추상 클래스를 상속받은 Add 클래스 객체 대입
			break;
		case '-':
			cal = new Sub(); // 추상 클래스를 상속받은 Sub 클래스 객체 대입
			break;
		case '*':
			cal = new Mul(); // 추상 클래스를 상속받은 Mul 클래스 객체 대입
			break;
		case '/':
			cal = new Div(); // 추상 클래스를 상속받은 Div 클래스 객체 대입
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			return;
		}
		
		cal.setValue(a, b); // 추상 클래스 메소드 호출
		
		result = cal.calculate(); // 상속받은 각 클래스의 오버라이드한 메소드 호출
		
		System.out.println(result);

	}

}
