package sec04;

public class 학생 {
	String gender; // 성별 멤버변수
	String code; // 학과 코드 멤버변수
	int point; // 시험 성적 멤버변수
	String println; // 출력 멤버변수

	public 학생(String gender, String code, int point) {
		// 매개변수 3개인 생성자, 기본생성자는 호출되지 않음
		this.gender = gender;
		this.code = code;
		this.point = point;
	}

	void start() {
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + code);
		System.out.println("성적 : " + point);

		String grade = end(point);
		System.out.println("당신의 학점 = " + grade);
	}

	String end(int x) {
		String result;
		if (x >= 90) {
			result = "A";
		} else if (x >= 80) {
			result = "B";
		} else if (x >= 70) {
			result = "C";
		} else {
			result = "F";
		}
		return result;
	}
}
/* 
 * <학생 클래스 생성>
 * 성별, 학과코드, 시험성적 -> 멤버변수 선언
 * 
 * 생성자 만들기
 * 생성자의 매개변수는 성별, 학과코드, 시험성적
 * 
 * start메소드는 리턴 X
 * -> 생성자에서 넘어온 값을 출력하고 내부에서 end메소드 호출
 * 
 * end메소드는 학점 리턴
 * ->시험성적으로 학점 구하기
 * 90이상 : A
 * 80이상 : B
 * 70이상 : C
 * 나머지 : F
 * 
 * <학생예제 메인클래스 생성>
 * 학생 클래스 객체 생성하고 매개변수로 성별, 학과코드, 시험성적 넘겨줌
 * ex) 학생 st = new 학생("남", "A123", 77);
 * 
 * 멤버변수에 값 대입
 * start라는 외부호출 메소드 작성
 * ex) st.start();
 * 
 * end메소드에서 넘어온 학점으로 결과 출력
 */