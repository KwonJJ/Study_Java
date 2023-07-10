package sec06;

public class Student01 {
	private String name; // 학생 이름
	private int age; // 학생 나이
	private String address; // 학생 주소
	private String phone; // 학생 핸드폰 번호
	
	public Student01(String name, int age) { // 이름, 나이 생성자
		this.name = name;
		this.age = age;
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
