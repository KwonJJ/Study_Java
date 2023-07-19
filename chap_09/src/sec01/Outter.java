package sec01;

public class Outter {
	String name = "홍길동 필드";
	
	void reNmae() {
		System.out.println("홍길동 이름 변경합니다.");
	}
	
	class Nested{
		String name = "장동건 필드";
		
		void reName() {
			System.out.println("장동건 이름 변경합니다.");
		}
		void print() {
			System.out.println(this.name); // Nested클래스의 장동건 출력
			System.out.println(Outter.this.name); // Outter클래스의 홍길동 출력
		}
	}
}

