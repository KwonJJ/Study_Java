package sec01;

public class SumExam01 {

	public static void main(String[] args) {
		Runnable even = new SumClass();
		Thread thread = new Thread(even);
		thread.start();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수 출력
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
				System.out.println(i);
			}
		}
	}
}
