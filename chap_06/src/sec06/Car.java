package sec06;

import java.util.Scanner;

public class Car {
	
	Scanner s = new Scanner(System.in);
	
	private String name;
	private String company;
	private String color;
	private int speed = 50; // 기본 스피드 50으로 설정

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor() {
		System.out.println("자동차 색상을 입력해 주세요.");
		String changeColor = s.next(); // 자동차 색상 입력
		color = changeColor; // 입력한 자동차 색상을 매개변수 color에 저장
		System.out.println("자동차 색상 : " + getColor()); // 자동차 색상 출력
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() {
		System.out.println("키를 눌러주세요 a : 속도 증가, s : 속도 감소");
		String key = s.next(); //속도증가(a), 속도 감소(s) 입력
		System.out.println("속도를 입력해 주세요.");
		int changeSpeed = s.nextInt(); // changeSpeed변수에 입력한 속도 저장
		int presentSpeed = getSpeed(); // presentSpeed변수에 speed값 저장
		
		if(key.equals("s") && presentSpeed < changeSpeed) {
			System.out.println("속도는 마이너스가 될 수 없습니다.");
		}
		else if(key.equals("s") && presentSpeed >= changeSpeed) {
			speed -= changeSpeed;
			System.out.println("현재 속도 : " + getSpeed());
		}
		else {
			speed += changeSpeed;
			System.out.println("현재 속도 : " + getSpeed());
		}
	}

}
/* 
 * Car클래스 생성
 * 멤버 변수 모두 private
 * 자동자 이름, 제조회사명, 색상, 속도(기본값 50)
 * 
 * 색상을 변경하는 메소드,
 * 속도를 변경하는 메소드(속도 증가, 속도 감소)
 * 
 * CarExample클래스 생성(메인 구문)
 * 사용자의 입력을 받습니다.
 * 1은 색상 변경, 2는 속도 변경, 3은 중단
 * (중단할 때까지 무한 반복)
 * 
 * 속도는 키보드의(아스키 코드)
 * 위쪽 방향키 = 속도증가(a)
 * 아래 방향키 =  속도 감소(s)
 * 단, 10씩 변경
 * 단, 속도는 -가 될 수 없음(0이 끝)
 * 다른거 누를시 다시 눌러야함
 */