package sec01;

public class SumExam02 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

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
			
		});
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
