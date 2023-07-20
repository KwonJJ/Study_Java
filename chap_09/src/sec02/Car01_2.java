package sec02;

public class Car01_2 {
	Car01 car01 = new Car01() {
		int speed;

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("속도가 " + speed + "만큼 증가합니다.");
		}

		@Override
		void stop() {
			System.out.println("자동차가 멈춥니다.");
			speedUp(50);
		}

	};

	void speedDown() {
		// 로컬 익명 객체 대입
		Car01 downCar = new Car01() {
			void down() {
				System.out.println("자동차 속도가 감소합니다.");
			}

			@Override
			void stop() {
				down();
			}
			
		};
		/*
		 * speedDown() 메소드를 호출하면 익명 객체 안의
		 * 메소드가 자동으로 실행되지 않음
		 */
		downCar.stop();
	}
}
/*
 * 필드값으로 익명 객체를 대입
 * car 메소드 오버라이드하고
 * speedUp(int speed) 메소드 만들기
 */
