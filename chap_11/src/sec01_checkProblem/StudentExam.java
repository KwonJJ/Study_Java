package sec01_checkProblem;

import java.util.HashMap;

public class StudentExam {

	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<Student, String>();
		// Student키로 총점을 저장하는 HashMap 객체 생성
		
		hashmap.put(new Student("1"), "95");
		// new Student("1")의 점수가 95를 저장
		
		String score = hashmap.get(new Student("1"));
		// new Student("1")로 점수를 읽어옴
		System.out.println("1번 학생의 총점 : " + score);
	}

}
