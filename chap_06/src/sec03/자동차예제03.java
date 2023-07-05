package sec03;

public class 자동차예제03 {

	public static void main(String[] args) {
		Car03 car1 = new Car03();
		System.out.println("회사명 : " + car1.company);
		System.out.println();
		
		Car03 car2 = new Car03("자가용");
		System.out.println("회사명 : " + car2.company);
		System.out.println("모델명 : " + car2.model);
		System.out.println("색깔 : " + car2.color);
		System.out.println("최고속도 : " + car2.maxSpeed);
		System.out.println();
		
		Car03 car3 = new Car03("자가용", "빨강");
		System.out.println("회사명 : " + car3.company);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색깔 : " + car3.color);
		System.out.println("최고속도 : " + car3.maxSpeed);
		System.out.println();

		Car03 car4 = new Car03("택시", "검정", 200);
		System.out.println("회사명 : " + car4.company);
		System.out.println("모델명 : " + car4.model);
		System.out.println("색깔 : " + car4.color);
		System.out.println("최고속도 : " + car4.maxSpeed);
		System.out.println();
		
	}
}
