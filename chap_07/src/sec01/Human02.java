package sec01;

public class Human02 {
	int weight; // 몸무게
	int height; // 키
	String gender; // 성별
	/*
	Human02(){ // 방법 1(default생성자 사용), 방법2는 Student02클래스에 있음
		
	}
	*/
	
	Human02(int weight, int height){
		this.weight = weight;
		this.height = height;
	}
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
