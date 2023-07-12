package sec02;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	public Tire(String location, int maxRotation) {
		// Tire 생성자
		this.maxRotation = maxRotation; // 필드의 타이어의 위치 초기화
		this.location = location; // 필드의 최대 회전수(타이어수명) 초기화
	}

	public boolean roll() {
		// 메소드
		++accumulatedRotation; // 누적 회전수 1 증가

		if (accumulatedRotation < maxRotation) { 
			// 정상회전(누적 < 최대)일 경우 실행
			// 누적회전수가 최대회전수보다 작으면 회전수 증가시키고 몇 회 회전했는지 (타이어 수명) 출력
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else { 
			// 펑크(누적 = 최대)일 경우 실행
			// 누적회전수가 최대회전수 이상이면 타이어 펑크 출력
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}

}
