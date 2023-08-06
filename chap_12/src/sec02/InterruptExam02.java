package sec02;

public class InterruptExam02 {

	public static void main(String[] args) {
		Thread thread = new PrintThread02();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		thread.interrupt();
		// 스레드를 종료하기 위해 InterruptedException을 발생시킴 
	}

}
