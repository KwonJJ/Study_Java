package sec01;

public class CarExam {

	public static void main(String[] args) {
		System.out.println("차가 출발합니다.");
		System.out.println();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 50; i <= 200; i += 50) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
					System.out.print(" 현재 속도 : " + i + "km");
					System.out.println();
				}
			}

		});
		thread.start();

		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			System.out.print("속도를 올립니다.");
		}

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println();
		System.out.println("차가 멈춥니다.");
	}

}
