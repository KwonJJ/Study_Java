package sec02.exam05;

public class ImplementationC implements InterfaceC {
	// InterfaceC는 3개의 인터페이스를 가지고 있으니 3개의 메소드를 만들어야함

	@Override
	public void methodA() {
		System.out.println("메소드 A 실행");
	}

	@Override
	public void methodB() {
		System.out.println("메소드 B 실행");
	}

	@Override
	public void methodC() {
		System.out.println("메소드 C 실행");
	}
	
	
	
}
