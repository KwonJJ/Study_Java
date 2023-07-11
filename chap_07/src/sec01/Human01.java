package sec01;

public class Human01 {
	int weight; // 몸무게
	int height; // 키
	String gender; // 성별
	
	//생성자는 default
	
	// 메소드(ex.인간 = 행동)
	void sleep() {System.out.println("잠이 듭니다.");}
	void awake() {System.out.println("일어납니다.");}
	
	String eat(String food) {
		String result = food + "를 먹습니다.";
		return result;
	}
	
	String run(int speed) {
		String result = speed + "m/s속도로 달립니다.";
		return result;
	}
}
