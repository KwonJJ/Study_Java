package sec02.problem;

public class Tire {
	String company; // 회사
	String type; // 종류
	int cost; // 가격
	String use; // 타이어 용도(사계전, 여름용, 겨울용)
	
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
	
	void stop() {
		System.out.println("타이어가 멈춥니다.");
	}
	
	void tireCompany() {
		System.out.println("금호 타이어입니다.");
	}
	
	void tireCar() {
		System.out.println("suv차량 전용 타이어입니다.");
	}
	
	void tireChange() {
		System.out.println("타이어를 교체합니다.");
	}
}
