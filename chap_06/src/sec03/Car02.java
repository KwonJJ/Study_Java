package sec03;

public class Car02 {
	//필드
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car02() {
		/*
		 * 기본 생성자 -> 보통 맨 위에 생성함
		 * 위에 있는걸 모두 쓰고 싶다면 기본 생성자 만들면 사용 가능.
		 * <생성자를 만들지 않으면 컴퓨터에서 자동으로 생성해줌>
		 */
	}
	
	public Car02(String model, int speed) { // 필드의 model과 speed를 초기화시킴
		this.model = model; //this.변수명 -> 위에 있는 필드 변수
		this.speed = speed; //this.변수명 -> 위에 있는 필드 변수
	}
	/*
	 * 보통 알아먹기 쉽게 하기위해 변수명을 똑같이 설정하지만 그렇게 하면
	 * 필드 변수와 매개 변수이름(입력하는 변수)이 같아져서 구분하기 힘들기 때문에
	 * this.변수명을 사용해서 구분지음
	 */
	
	public Car02(String model, String color, int maxSpeed) {
		this.model = model; //this.변수명 -> 위에 있는 필드 변수
		this.color = color; //this.변수명 -> 위에 있는 필드 변수
		this.maxSpeed = maxSpeed; //this.변수명 -> 위에 있는 필드 변수
	}
}
/* 
 * 파라미터가 3개 있는 생성자 만들기
 * model, color, maxSpeed
 * 
 * 자동차예제02에서 생성자 이용해서 호출
 * 테슬라3, 빨간색, 350 넣고 출력
 */