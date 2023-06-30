package sec02;

public class continue예제01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { //1부터 10까지 10번 반복
			if (i % 2 != 0) { //i가 홀수면 생략(밑에 있는 출력문)
				continue;
			}
			System.out.println(i); //이게 (홀수)생략됨

		}
	}

}
