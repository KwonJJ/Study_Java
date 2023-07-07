package sec05;

public class CalculatorExam {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println(result1);
	}

}
/* 
 * static(정적)메소드 선언시 주의할 점
 * 1. 정적 메소드 선언 시 그 내부에 인스턴스 필드 및 메소드 사용 불가
 * 2. 정적 메소드 선언 시 그 객체 자신 참조인 this키워드 사용 불가
 * 
 * 3. 정적 메소드에서 인스턴스 멤버 사용하려는 경우 new객체 생성하면 사용 가능
 */