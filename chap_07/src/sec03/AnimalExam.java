package sec03;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		// Animal  animal = new Animal(); -> 추상 클래스는 객체 생성 불가능
		
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		Animal animal = new Dog(); // 자동 타입변환
		animal.sound(); // 오버라이딩된 dog의 메소드 호출
		
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) { // Dog(자식)객체를 Animal(부모)객체로 타입 변환
		// 매개 변수가 Animal타입인 메소드
		animal.sound(); // 재정의된 메소드 호출
		
	}
	
}
