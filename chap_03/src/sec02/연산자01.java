package sec02;

public class 연산자01 {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // + -> 피연산자 : 피연산자의 부호 유지
		int result2 = -x; // - -> 피연산자 : 피연산자의 부호 변경
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
		//byte result3 = -b; -> (에러 발생)byte에 - 붙이면 int로 변경됨.
		int result4 = -b; //byte값을 int로 변환해야 오류 발생 안함
		System.out.println(result4);
	}

}