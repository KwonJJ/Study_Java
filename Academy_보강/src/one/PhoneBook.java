package one;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Phone phone[];
		// 클래스 타입의 배열 생성, 개수는 정해지지 않음

		System.out.print("인원수 >> ");
		int num = s.nextInt();
		phone = new Phone[num];
		// 인원수를 받아들여 그 수만큼 클래스 타입의 배열 생성함

		int i; // 전역변수 i선언

		for (i = 0; i < phone.length; i++) {
			// 배열의 길이만큼 반복해서 이름과 전화번호를 입력받아 각 배열의 방에 Phone 객체를 생성하여 넣음

			System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력) : ");
			String name = s.next();
			String phoneNumber = s.next();

			phone[i] = new Phone(name, phoneNumber);
		}

		System.out.println("저장되었습니다....");

		while (true) {
			System.out.print("검색할 이름 : ");
			String name = s.next();

			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.printf("%s의 번호는 %s입니다.\n", name, phone[i].getPhoneNumber());
					break;
					// break 역할 -> 찾는 데이터가 있으면 이름과 번호를 출력 후 for문 종료
				}
			}
			if (name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				// "그만"을 입력하면 while 종료
			}
			if (i == num) {
				// 찾는 데이터가 없으면 없다는 안내문 출력
				System.out.println(name + "이 없습니다.");
			}
		}
	}

}
/*
 * 이름, 전화번호 필드와 생성자를 가진 Phone 클래스 작성하고
 * 아래와 같이 작동하는 PhoneBook클래스 작성 
 * <출력 예제>  
 * 인원수를 입력하세요 : 3
 * 이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력) : 홍길동 111-2222
 * 이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력) : 장동건 222-3333
 * 이름과 전화번호(이름과 전화번호는 빈 칸 없이 입력) : 오수미 444-5555
 * 저장되었습니다
 * 
 * 검색할 이름 : 김동건
 * 김동건이 없습니다.
 * 
 * 검샘학 이름 : 장동건
 * 장동건의 전화번호는 222-3333입니다.
 * 
 * 검색할 이름 : 그만
 * 프로그램을 종료합니다.
 */