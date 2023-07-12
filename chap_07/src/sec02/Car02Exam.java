package sec02;

public class Car02Exam {

	public static void main(String[] args) {
		Car02 car = new Car02(); 
		// car의 객체 생성
		// car객체는 Car02클래스의 필드, 메소드 사용 가능함

		for (int i = 1; i <= 5; i++) {
			// Car객체의 run()메소드 5번 반복 실행
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
				// 앞왼쪽 타이어가 펑크 났을 때 HankookTire로 교체

			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRigntTire = new KumhoTire("앞으론쪽", 13);
				break;
				// 앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체

			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				// 뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
				
			case 4 :
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
				//뒤오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
			}
			System.out.println("-----------------------------");
			// 1회전 시 출력되는 내용을 구부
		}
	}

}
