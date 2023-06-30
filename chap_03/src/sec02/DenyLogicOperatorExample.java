package sec02;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
/*<논리 부정 연산자(!)>
! ->   boolean타입에만 사용가능
피연산자가 true면 false값을 산출
피연산자가 false면 true 값을 산출
 * */
