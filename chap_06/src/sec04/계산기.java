package sec04;

public class 계산기 {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int minus(int x, int y) {
		int result;
		if(x < y) { //음수 안나오게하는 조건
			result = y - x;
		} else {
			result = x - y;
		}
		return result;
	}
	
	String mul(int x, int y) {
		if(x == 0 || y == 0) {
			String message = "0은 입력할 수 없습니다.";
			return message;
		} else { // 문자열을 int형으로 형변환
			int result = x * y;
			return String.valueOf(result);
		}
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	
}
