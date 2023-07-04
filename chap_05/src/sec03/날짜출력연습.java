package sec03;

import java.util.Calendar;

public class 날짜출력연습 {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR); //현재 년도 컴퓨터에서 가져옴
		int month = cal.get(Calendar.MONTH) + 1; //현재 월 컴퓨터에서 가져옴
		int day = cal.get(Calendar.DAY_OF_MONTH); //현재 일 컴퓨터에서 가져옴
		int week = cal.get(Calendar.DAY_OF_WEEK); //현재 요일(1~7) 컴퓨터에서 가져옴
		int time = cal.get(Calendar.HOUR); //현재 시간 컴퓨터에서 가져옴
		int minute = cal.get(Calendar.MINUTE); //현재 분 컴퓨터에서 가져옴
		int second = cal.get(Calendar.SECOND); //현재 초 컴퓨터에서 가져옴
		
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
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + time + "시 입니다.");
		System.out.printf("현재 %d년 %d월 %d일 %s %d시 %d분 %d초 입니다.", year, month, day, today, time, minute, second);
	}

}
/* 
 * 현재 년도, 월, 일, 시간 입니다 출력
 */