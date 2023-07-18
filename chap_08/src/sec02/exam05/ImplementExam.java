package sec02.exam05;

public class ImplementExam {

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		InterfaceC ic = imple;
		// 인터페이스C 객체인 ic는 A와 B의 모든 메소드 사용 가능함
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
