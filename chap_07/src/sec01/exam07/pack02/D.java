package sec01.exam07.pack02;

import sec01.exam07.pack01.A;

public class D extends A {

	String a;
	String b;

	public D() {
		// 다른 패키지라도 상속받은 자식 클래스는 접근됨
		super();
		this.field = "value";
		this.method();
		this.a = a;
		this.b = b;

	}
}
