package teacherProblem;

public class word {
	private String english; // 영단어
	private String korean; // 한글

	public word(String english, String korean) {
		// 생성자로 영단어와 한글 단어 같이 입력받음
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() { // 영단어 리턴 메소드
		return english;
	}

	public String getKorean() { // 한글 리턴 메소드
		return korean;
	}

}
