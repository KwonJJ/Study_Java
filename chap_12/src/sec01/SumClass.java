package sec01;

public class SumClass implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) { // 홀수 출력
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println(i);
			}
		}
	}

}
