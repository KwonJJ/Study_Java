package sec04;

public class CalculatorExam01 {

	public static void main(String[] args) {
		Calculator01 myCalc = new Calculator01(); // 매개 변수를 넣지 않으면 기본 생성자를 호출
		
		myCalc.println("가나다");
		// 리턴값 X, 내부 호출 X
		// println메소드에 "가나다"라는 문자열 넘겨줘서 가나다 출력됨

		myCalc.plus(6, 4);
		// 리턴값 O, 내부 호출 X
		// 리턴값은 존재하지만 출력 구문을 넣지 않아서 출력되진 않음

		int result1 = myCalc.plus(6, 4); // 합계 메소드만 호출
		System.out.println(result1); // 이렇게 출력 값을 넣어줘야 출력됨

		double result2 = myCalc.avg(10, 15); // 합계 메소드 호출 후 평균 메소드 호출
		System.out.println(result2);

		myCalc.execute();
		/*
		 * execute메소드 자체는 void이기 때문에 리턴값 X이고 내부 호출 3번실행
		 * 내부 호출 흐름 : excute메소드 호출 -> avg메소드 호출 -> plus메소드 호출
		 * 리턴값 흐름 : plus메소드 리턴 -> avg메소드 리턴 -> println메소드로 
		 * 리턴(출력) 후 println은 void이기 때문에 리턴값 없이 끝남.
		 */
	}

}
