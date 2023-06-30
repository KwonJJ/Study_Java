package sec02;

public class for중첩01 {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***"); // ***?단*** 출력
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n)); // ? X ? = ? 출력
			}
		}
	}

}
