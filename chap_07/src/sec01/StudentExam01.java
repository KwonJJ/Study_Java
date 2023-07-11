package sec01;

public class StudentExam01 {

	public static void main(String[] args) {
		Student01 stu = new Student01(20220711, "남자", 180); // Student01클래스 객체 생성
		
		stu.dressOn();
		stu.dressOff();
		stu.study("도서관"); // Student01클래스의 study메소드 호출
		
		String speed = stu.run(10); // speed변수에 Human(부모)메소드 리턴값 저장
		// Human(부모) 메소드 호출
		System.out.println(speed);
		
		String food = stu.eat("피자");  // food변수에 Human(부모)메소드 리턴값 저장
		// Human(부모) 메소드 호출
		System.out.println(food);
		
		stu.sleep(); // Human(부모) 메소드 호출
		stu.awake(); // Human(부모) 메소드 호출
		
	}

}
/* 
 * StudentExam 메인구문 생성
 * Student 객체 생성(매개변수(파라미터) 3개 넘겨주기)
 * 자기 메소드 1개 호출(아무거나)
 * 부모 메소드 2개 호출 후 결과 확인
 */