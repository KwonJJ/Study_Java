package sec03;

public class 학생예제01 {

	public static void main(String[] args) {
		Student student1 = new Student(); //기본생성자 호출
		
		System.out.printf("이름 : %s, 나이 : %d\n\n", student1.name, student1.age);
		
		Student student2 = new Student("홍수아", 30); //매개변수 2개 생성자 호출
		System.out.printf("이름 : %s, 나이 : %d\n\n", student2.name, student2.age);
		
		Student student3 = new Student("홍길동", "20231111", "010-5555-7777"); //매개변수 3개 생성자 호출
		System.out.printf("이름 : %s, 학번 : %s, 연락처 : %s\n\n", student3.name, student3.studetId, student3.phoneNumber);
	}

}
/* 
 * <학생예제 메인클래스 파일 만들기>
 * 
 * 1. 기본 생성자로 객체를 생성 후 이름, 나이 출력
 * 
 * 2. 매개변수 2개 생성자로 객체 생성 후
 *    이름 : 홍수아, 나이 : 30으로 설정 후 출력
 * 
 * 3. 매개변수 3개 생성자로 객체 생성 후
 *    이름 : 홍길동, 학번 : 20231111, 연락처 : 010-5555-7777 설정 후 출력
 */