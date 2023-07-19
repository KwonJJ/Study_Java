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
	}

}
