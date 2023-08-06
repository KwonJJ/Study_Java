package sec01_TeacherProblem;

import java.util.Calendar;

public class 자바맨의일상 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH) + 1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("자바맨의 일상");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println();
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");

		Runnable wake = new WakeUp();
		Thread t1 = new Thread(wake);
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
				}
				System.out.println("공부합니다.");
			}

		});
		t2.start();

		Thread t3 = new Sleep();
		t3.start();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		
		try {Thread.sleep(4000); } catch(Exception e) {}
		System.out.println();
		System.out.println("오늘은 " + year + "년 " + month + "월 " + (day + 1) + "일 입니다.");

		Thread t4 = new Thread(wake);
		t4.start();

		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {Thread.sleep(2000);} catch(Exception e) {}
				System.out.println("공부합니다.");
			}
			
		});
		t5.start();
		
		Thread t6 = new Sleep();
		t6.start();
	}

}
/*
 * 자바맨의 일상 (메인)
 * 오늘 날짜 출력
 * -> 오늘은 2023년 7월 28일 입니다.(메인)
 * 
 * 기상합니다.(스레드) -> 기본방식(implements Runnable)
 * 공부합니다.(스레드) -> 익명 구현 객체
 * 잠을잡니다.(스레드) -> 상속 받은 객체(extends Thread)
 * 
 * 내일 날짜 출력
 * -> 오늘은 2023년 7월 29일 입니다.(메인)
 * 
 * 기상합니다.(스레드)
 * 공부합니다.(스레드)
 * 잠을잡니다.(스레드)
 */