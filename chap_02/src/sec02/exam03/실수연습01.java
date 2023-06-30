package sec02.exam03;

public class 실수연습01 {

	public static void main(String[] args) {
		//float var1 = 3.14; -> 오류 발생
		float var1 = 3.14f; //float타입은 반드시 뒤에 f붙여야함
		double var2 = 3.14; //double는 노상관
		
		float var4 = 0.1234567890123456789f; //끝이 반올림
		double var5 = 0.1234567890123456789; //끝이 반올림
		
		System.out.println(var4); 
		System.out.println(var5);
		
		double var6 = 3e6; //3 뒤에 0 6개 반복(소수점이라 출력시 .0으로 출력됨)
		float var7 = 3e6f; 
		
		double var8 = 2e-3; 
		double var9 = 237e-4; 
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
	}

}