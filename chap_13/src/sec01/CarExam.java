package sec01;

import java.util.*;

public class CarExam {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("작업 내용을 선택");
			System.out.println("1 : 추가, 2 : 삭제, 3 : 출력, 4 : 종료");
			int n = 0;
			
			try {
				n = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("잘못 입력 했습니다.");
				return; // n = 4;(종료)와 동일
			}

			switch (n) {
			case 1:
				System.out.print("차량 회사는? ");
				String company = s.next();

				System.out.print("차량 가격은? ");
				int cost = s.nextInt();

				System.out.print("차량 최고속도는? ");
				int maxSpeed = s.nextInt();

				System.out.print("차량 색상은? ");
				String color = s.next();

				list.add(new Car(company, cost, maxSpeed, color));
				break;

			case 2:
				System.out.println("삭제할 데이터의 인덱스 번호 입력");
				int num = s.nextInt();
				list.remove(num);
				break;

			case 3:
				for (int i = 0; i < list.size(); i++) {
					Car car = list.get(i);
					System.out.println(car.company + " " + car.cost + " " + car.maxSpeed + " " + car.color + " ");
				}
				break;

			case 4:
				run = false;
				break;
			}

		}

	}

}
/* 
 * 1. 데이터 추가 
 * 사용자로부터 데이터 입력 받아 
 * 자동차 클래스 객체를 생성하여 리스트에 추가
 * 
 * 2. 데이터 삭제
 * 사용자로부터 방 번호를 입력받아 리스트 데이터를 삭제
 * 
 * 3. 데이터 출력
 * 입력된 리스트 데이터를 모두 출력
 * 
 * 4. 종료
 */