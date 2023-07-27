package sec01;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("쓰레드 B");
	}

	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
	
}
