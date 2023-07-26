package sec02;

import java.util.Calendar;

public class CalendarExam01 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("현재 시각 : " + hour + "시"); // 운영체제 기준으로 시간 끌어옴
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
}

}
/* <교재 오타(p.515)>
 * int week = now.get(Calendar.AM_PM); -> 오전, 오후 리턴
 * int amPm = now.get(Calendar.DAY_OF_WEEK); -> 요일 리턴
 */