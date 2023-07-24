package sec01_problem;

public class iPhoneExam {

	public static void main(String[] args) {
		iPhone iphone = new iPhone("애플", 1500000, "아이폰 14");

		String ip = iphone.toString(); // 오버라이드된 toString()호출
		System.out.println(ip);
		// 재정의된 toString()을 호출하고 리턴값을 받아 출력
	}

}
