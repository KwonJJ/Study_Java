package sec03;

public class Car03 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car03(){
		
	}
	
	public Car03(String model) { //같은 것이 중복될 경우 코드를 줄이기 위해 사용(자동차예제03에 car5에서 출력)
		this(model, "은색", 250); //다른 생성자 호출:this()는 생성자의 첫 줄에서만 사용가능
	}

	public Car03(String model, String color) { //같은 것이 중복될 경우 코드를 줄이기 위해 사용(자동차예제03에 car5에서 출력)
		this(model, color, 250);
	}

	public Car03(String model, String color, int maxSpeed) {
		this.model = model; //공통 실행 코드
		this.color = color; //공통 실행 코드
		this.maxSpeed = maxSpeed; //공통 실행 코드
	}
}