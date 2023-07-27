package sec01;

public class MainThreadExam {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		User01 user1 = new User01();
		user1.setCalculator(calculator);
		user1.start();

		User02 user2 = new User02();
		user2.setCalculator(calculator);
		user2.start();

	}

}
