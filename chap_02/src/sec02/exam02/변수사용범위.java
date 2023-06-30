package sec02.exam02;

public class 변수사용범위 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 -10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}
		
	}

}
