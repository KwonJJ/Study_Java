package sec01;

public class ThreadNameExam01 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("기본 쓰레드 이름 : " + mainThread.getName());
		
		Thread threadA = new Thread();
		System.out.println("첫 번째 작업 쓰레드 이름 : " + threadA.getName());
		threadA.start();

		Thread threadB = new Thread();
		System.out.println("두 번째 작업 쓰레드 이름 : " + threadB.getName());
		threadB.start();
		
		
	}

}
