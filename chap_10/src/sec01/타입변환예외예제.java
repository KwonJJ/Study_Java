package sec01;

public class 타입변환예외예제 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		
		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2;
		
	}

}
