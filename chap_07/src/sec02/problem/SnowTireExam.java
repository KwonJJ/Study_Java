package sec02.problem;

public class SnowTireExam {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire(); // SnowTire는 부모 객체로부터 상속 받았기 때문에 부모, 자기꺼 둘 다 사용 가능
		Tire tire = snowTire; 
		// 자식객체를 부모객체에 자동 타입 변환
		// 자기꺼와 오버라이드 한 것만 사용 가능(그 외의 부모꺼 사용 불가능)
		
		snowTire.run();
		tire.run();
		
		snowTire.stop();
		tire.stop();
		
	}

}
