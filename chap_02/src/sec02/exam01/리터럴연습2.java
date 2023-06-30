package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115; 
		byte var2 = 0;
		byte var3 = 127; //byte = -128 ~ 127
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		// bit < byte < short < int < long
		
		long var4 = 12345678L; //정수는 기본적으로 int로 인식
		//long var5 = 1000000000000; //작은 수 입력했을 땐 없지만 큰 수를(int의 허용범우를 넘어갔을 시) 입력했을 땐 오류가 나니 마지막에 L을 붙여야함.
		long var6 = 1000000000000L; //int와 헷갈리기 때문에 마지막에 L을 붙이는 것이 공식
		System.out.println(var4);
		//System.out.println(var5);
		System.out.println(var6);
	}

}
