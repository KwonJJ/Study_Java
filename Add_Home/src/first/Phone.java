package first;

public class Phone {
	private String name; // 이름 필드
	private String phoneNumber; // 전화 번호 필드
	
	Phone(String name, String phoneNumber) { 
		// 이름, 전화번호 생성자
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
}
