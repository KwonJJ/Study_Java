package sec02;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//부모 클래스의 메소드 오버라이드
	@Override
	public boolean roll() {
		// 메소드
		++accumulatedRotation; // 누적 회전수 1 증가

		if (accumulatedRotation < maxRotation) { 
			// 정상회전(누적 < 최대)일 경우 실행
			// 누적회전수가 최대회전수보다 작으면 회전수 증가시키고 몇 회 회전했는지 (타이어 수명) 출력
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { 
			// 펑크(누적 = 최대)일 경우 실행
			// 누적회전수가 최대회전수 이상이면 타이어 펑크 출력
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
