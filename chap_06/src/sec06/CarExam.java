package sec06;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;

		Car car = new Car();

		while (run) {
			System.out.println("1 : 색상 변경, 2 : 속도 변경, 3 : 중단");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				car.setColor();
				break;

			case 2:
				car.setSpeed();
				break;

			case 3:
				run = false;
				break;

			default:
				System.out.println("잘못 입력했습니다.");
			}

		}

	}

}
