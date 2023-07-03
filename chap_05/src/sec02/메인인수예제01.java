package sec02;

public class 메인인수예제01 {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strN1 = args[0]; //상단 run -> Debug Configurations... 클릭 -> Arguments창 클릭 -> Program arguments에 배열에 넣을 숫자 넣으면 대입됨
		String strN2 = args[1];
		
		int n3 = Integer.parseInt(strN1); //이게 필요한 이유는 메인 구문이 스트링 타입이기 때문에 int타입으로 변환 해줘야 함. 
		int n4 = Integer.parseInt(strN2); //이게 필요한 이유는 메인 구문이 스트링 타입이기 때문에 int타입으로 변환 해줘야 함.
		
		int result = n3 + n4;
		
		System.out.println(n3 + " + " + n4 + " = " + result);
	}

}
