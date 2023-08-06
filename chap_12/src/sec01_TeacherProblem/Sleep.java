package sec01_TeacherProblem;

public class Sleep extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println("잠을잡니다.");
	}

}
