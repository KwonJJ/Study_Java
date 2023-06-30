package sec02.exam02;

public class 변수값교환 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x = " + x + ", y = " + y);
		
		int temp = x; //temp라는 변수를 생성하여 x값을 대입시킴 temp = 3;
		x = y; //변수 x에 변수 y값을 대입시킴 x = 5;
		y = temp; //변수 y에 변수 temp값을 대입시킴 y = 3;
		//해당 구문은 변수 x와 y값을 서로 교체하는 구문임
		System.out.println("x = " + x + ", y = " + y);
	}

}
