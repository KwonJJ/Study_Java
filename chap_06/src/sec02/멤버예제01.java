package sec02;

public class 멤버예제01 {

	public static void main(String[] args) {
		Member m = new Member(); //보통 인스턴스 변수명은 클래스명과 연관된 것으로 가져오는게 일반적
		
		m.name = "최하얀"; //name 필드값 변경
		m.age = 23; //age 필드값 변경
		
		System.out.println(m.name);
		System.out.println(m.age);
	}

}
