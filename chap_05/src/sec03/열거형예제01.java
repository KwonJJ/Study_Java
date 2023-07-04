package sec03;

import java.util.Calendar;

public class 열거형예제01 {

	public static void main(String[] args) {
		Week today = null; //열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance(); //컴퓨터 기준으로 현재 날짜와 시간 정보를 가져옴
		int week = cal.get(Calendar.DAY_OF_WEEK); //일요일(1) ~ 토(7)까지의 숫자를 새로운 변수에 저장
		
		switch(week) {
		case 1:
			today = Week.일요일;
			break;
		
		case 2:
			today = Week.월요일;
			break;
		
		case 3:
			today = Week.화요일;
			break;
		
		case 4:
			today = Week.수요일;
			break;
		
		case 5:
			today = Week.목요일;
			break;
		
		case 6:
			today = Week.금요일;
			break;
		
		case 7:
			today = Week.토요일;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.일요일) {
			System.out.println("일요일은 축구를 합니다. ");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}

}
