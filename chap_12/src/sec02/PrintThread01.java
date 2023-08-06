package sec02;

public class PrintThread01 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			// stop가 true가 될 때까지 무한 반복
			System.out.println("실행 중");
			/*
			 * StopFlagExam의 try {Thread.sleep(1000);} catch(InterruptedException e)의
			 * 1초동안 '실행 중' 출력 후 종료
			 */
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	

	
}
