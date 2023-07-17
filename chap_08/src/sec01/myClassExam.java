package sec01;

public class myClassExam {

	public static void main(String[] args) {
		myClass my1 = new myClass();
		// 디폴트 생성자 호출(Television)
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		System.out.println();
		
		myClass my2 = new myClass(new Television());
		// 매개변수 1개 생성자 호출
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		System.out.println();
		
		myClass my3 = new myClass(new Audio());
		// 매개변수 3개 생성자 호출
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		System.out.println();
		
		myClass my4 = new myClass();
		// 매개변수 없는 메소드 호출(Audio 호출)
		my4.methodA();
		System.out.println();
		
		myClass my5 = new myClass();
		// 매개변수 있는 메소드 호출(Television 호출)
		my5.methodB(new Television());
		System.out.println();
	}

}
