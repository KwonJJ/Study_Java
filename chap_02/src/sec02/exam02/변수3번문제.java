package sec02.exam02;

public class 변수3번문제 {

	public static void main(String[] args) {
		int sum, score1 = 0, score2 = 1;
		sum = score1 + score2;
		System.out.println(sum);
		
		int v1 = 0;
		if(true) {
			int v2 = 0;
			int v3 = 0;
			if(true) {
				v1 = 1;
				v2 = 2;
				v3 = 3;
			}
			v1 = v2 + v3;
		}
		System.out.println(v1);
	}

}
