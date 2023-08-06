package sec02;

import java.awt.Toolkit;

public class SleepExam {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
				System.out.println("띵");
			} catch(Exception e) {
				System.out.println("인터럽트 오류가 발생했습니다.");
			}
		}
	}
}
