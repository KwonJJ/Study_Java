package sec02.problem;

public class AnonymousExam {

	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();

		annoy.field.start();
		annoy.method1();
		annoy.method2(new Worker() {
			// method2에 Worker이 들어가 있으니 Worker를 호출해야함

			@Override
			public void start() {
				System.out.println("테스트를 합니다.");
			}
			
		});
	}

}
