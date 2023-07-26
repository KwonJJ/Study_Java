package sec02_problem;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("연도 입력 : ");
		int y = s.nextInt();

		System.out.print("월 입력 : ");
		int m = s.nextInt();

		Calendar start = Calendar.getInstance(); // start는 로딩한 시점의 날짜 정보 가져옴
		Calendar end = Calendar.getInstance(); // end도 로딩한 시점의 날짜 정보 가져옴
		
		start.set(y, m - 1, 1); 
		/*
		 * get으로 가져온 현재 정보를 바꿔치기함
		 * 시작 월 세팅, m - 1을 해줘야 사용자가 입력한 월 수를 정확히 인식
		 * 컴퓨터에 저장되 있는 m은 0 ~ 11임
		 * */
		end.set(y, m, 1); 
		/*
		 * get으로 가져온 현재 정보를 바꿔치기함
		 * 끝나는 월 세팅, 입력한 다음달의 1일로 세팅하고
		 * */
		end.add(Calendar.DATE, -1);
		// 마지막 날짜를 입력한 달에서 1을 뺀 날짜로 세팅
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		// 요일 번호 추출 일요일 : 1, 토요일 : 7
		
		System.out.println();
		System.out.println("=========[" + y + "년]==========");
		System.out.println("===========[" + m + "월]===========");
		System.out.println(" 일 월 화 수 목 금 토");
		
		for(int i = 1; i < dayweek; i++) {
			System.out.print("   ");
			// 요일 번호에 해당하는 만큼 공백 추가(한 자리에 3칸)
		}
		
		for(int i = 1, n = dayweek; i <= end.get(Calendar.DATE); i++, n++) {
			System.out.printf("%3d", i);
			// 정렬을 위해 3자리 맞춰서 날짜 출력(2자리는 날짜, 1자리는 사이 여백)
			
			if(n % 7 == 0) {
				System.out.println();
				// 요일 번호가 7.. 토요일이라면 줄 바꿈
			}
		}
	}

}
/*
 * 달력 출력
 */
