package sec05;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		myCar.run();
		
		//speed = 60; -> 컴파일 에러
		Car yourCar = new Car(); //객체 생성해줘야 가능함
		yourCar.speed = 60; //가능
	}

}
