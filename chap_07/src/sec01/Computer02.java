package sec01;

public class Computer02 extends Calculator02{

	@Override // 마우스 우클릭 -> source -> 
	double areaCircle02(double r) {
		System.out.println("Computer02 객체의 areaCircle02() 실행");
		return Math.PI * r * r;
	}
	/*
	// 메소드 재정의
	@Override // 안서도 되지만 써야함(관례임)
	double areaCircle02(double r) { 
		System.out.println("Computer02 객체의 areaCircle02() 실행");
		return Math.PI * r * r;
	}
	*/
	
	
}
