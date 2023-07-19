package sec01;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		Car.OldCar oldcar = car.new OldCar();
		car.cost = 5000;
		car.speedUp(30);
		
		oldcar.cost = 3000;
		oldcar.speedUp(50);
		
		System.out.println(car.cost);
		System.out.println(car.speed);
		System.out.println(oldcar.cost);
		System.out.println(oldcar.speed);
		
		Car.Truck truck = new Car.Truck();
		// 정적 클래스(static) Truck
		truck.cost = 6000;
		truck.speedUp(100);
		System.out.println(truck.cost);
		System.out.println(truck.speed);
		
		oldcar.carCall();
	}

}
