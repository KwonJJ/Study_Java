package sec01;

public class SystemExitExam {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				if(i == 50) {
					System.out.println("50이 나와서 중지했습니다.");
					System.exit(0); // -> (= break;)
				}
			}
		}
		/* 선생님 방식
		for(int i = 1; i <= 100; i++) {
			if(i == 50) {
				System.out.println("50이 나와서 중지했습니다.");
				System.exit(0);
			} else if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		*/
	}

}
