package sec01;

public class OutterExam {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
		/*
		 * Nested가 만약 정적 클래스일 때 호출 방법
		 * Outter.Nested nested = new Outter.Nested();
		 */
	}

}
