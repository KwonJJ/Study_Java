package sec04;

public class Calculator01 { // 메소드만 만들어 놨기 때문에 순서는 없음(위에서부터 시작 X)
	int plus(int x, int y) { // 합계 구하는 메소드
		int result = x + y;
		return result; // int값 리턴
	}

	double avg(int x, int y) { // 평균 구하는 메소드, 이 메소드 호출시 합계(sum = plus(x, y))메소드 갔다가 호출됨
		double sum = plus(x, y); // 객체 내부에서 합계 메소드 호출
		double result = sum / 2; // double메소드로 했기때문에 double로 리턴시켜줘야함
		return result; // double값 리턴
	}

	void execute() {
		double result = avg(7, 10); // 이 메소드 호출시 avg메소드 호출 후 avg메소드에서 plus메소드 호출 후 돌아와서 void메소드 호출됨
		println("실행 결과 : " + result); // -> 문자열로 인식, (System.out,println())이 아님
	}

	void println(String message) {
		System.out.println(message);
	}

}
