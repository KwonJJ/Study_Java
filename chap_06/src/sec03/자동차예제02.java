package sec03;

public class 자동차예제02 {

	public static void main(String[] args) {
		Car02 c2 = new Car02("BMW", 250); //사용자 정의 생성자 호출
		
		System.out.println("모델명 : " + c2.model);
		System.out.println("속도 : " + c2.speed);
		System.out.println("제조회사 : " + c2.company); //값을 넣지 않아서 초기값인 null이 나옴
		
		
		Car02 c3 = new Car02("테슬라3", "빨간색", 350);
			System.out.println("모델명 : " + c3.model);
			System.out.println("색깔 : " + c3.color);
			System.out.println("최고속도 : " + c3.maxSpeed);
	}

}
