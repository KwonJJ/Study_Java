package sec01.exam07.pack01;

public class B {
	public void method() { 
		// protected는 같은 패키지에서는 접근 가능함
		A a = new A();
		a.field ="value";
		a.method();
	}
}
