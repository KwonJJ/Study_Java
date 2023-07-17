package first;

import java.util.Scanner;

public class PhoneBook extends Phone{
	Scanner s = new Scanner(System.in);
	
	int count; // 인원수 필드
	
	public PhoneBook(String name, String phoneNumber, int count) {
		super(name, phoneNumber);
		this.count = count;
	}
	
	void input() {
		System.out.println("인원수를 입력하세요 >> ");
		count = s.nextInt();
		
		for(int i = 0; i <= count; i++) {
			System.out.print("이름과 전화번호(이름과 전호번호는 빈 칸 없이 입력) >> ");
			name = s.next();
			phoneNumber = s.next();
		}
	}
	
}
