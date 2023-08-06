package sec02;

public class StopFlagExam {

	public static void main(String[] args) {
		PrintThread01 printThread = new PrintThread01();
		printThread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		printThread.setStop(true);
	}

}
