package sec04;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.poewrOn();
		
		int result1 = car.speedUp(30);
		System.out.println(result1);
		
		int result2 = car.speedDown(80);
		System.out.println(result2);
		
		int result3 = car.breakZero();
		System.out.println(result3);
		
		car.powerOff();
	}

}
