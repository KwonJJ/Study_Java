package sec03;

public class 자동차예제01 {

	public static void main(String[] args) {
		//Car c = new Car(); -> 생성자를 이미 만들었기 때문에 안에 모델과, 속도 생성자 생성하지 않으면 오류생김
		
		Car01 c1 = new Car01("그랜저", 200); //모델명과 속도 생성자 호출
		Car01 c2 = new Car01(); //기본 생성자 호출
		
	}

}
