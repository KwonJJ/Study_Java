package sec06;

import java.util.Scanner;

public class Student02 {

	Scanner s = new Scanner(System.in);

	private String name = "홍길동"; // 학생 이름
	private String code = "A123"; // 학번
	private int middleScore; // 중간고사 점수
	private int finalScore; // 기말고사 점수
	private double avg; // 평균 점수

	final String id = "admin"; // 관리자 아이디
	final int password = 1234; // 관리자 비밀번호

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMiddleScore() {
		return middleScore;
	}

	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public boolean checkLogin() {
		System.out.println("아이디 입력");
		String id = s.next();
		System.out.println("패스워드 입력");
		int pw = s.nextInt();

		if (this.id.equals(id) && this.password == pw) {
			// final로 선언한 아이디와 패스워드가 입력한 id, pw변수와 동일하면 true로 리턴
			return true; // checkLogin에 true값 리턴
		} else {
			return false; // checkLogin에 false값 리턴
		}
	}

	public void inputExam() {
		System.out.println("중간고사 점수 입력 :");
		setMiddleScore(s.nextInt()); // setMiddleScore에 입력한 값(중간 점수) 저장

		System.out.println("기말고사 점수 입력 : ");
		setFinalScore(s.nextInt()); // setFinalScore에 입력한 값(기말 점수) 저장

		double avg = (double) (getMiddleScore() + getFinalScore()) / 2;
		setAvg(avg); // setAvg에 avg값 저장
		System.out.println(getName() + "님의 평균 점수 : " + getAvg());
	}
}
