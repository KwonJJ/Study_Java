package sec06;

public class StudentExam01 {

	public static void main(String[] args) {
		Student01 stu = new Student01("홍길동", 30);
		
		//stu.adress = "광주광역시"; -> private으로 접근 제한됨
		stu.setAddress("광주광역시");
		System.out.println(stu.getAddress());
	}

}
