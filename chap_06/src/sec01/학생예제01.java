package sec01;

public class 학생예제01 {

	public static void main(String[] args) {
		Student s1 = new Student(); //Student 클래스의 s1이라는 인스턴스 생성
		Student s2 = new Student(); //Student 클래스의 s2라는 인스턴스 생성
		
		// s1.age;
		// s1.setAge(40);
		
		if(s1 == s2) {
			System.out.println("같은 참조");
		} else {
		System.out.println("다른 참조");
		}
	}

}
