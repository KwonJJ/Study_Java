package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();
		
		myCar.setGas(5); //Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다. ");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { //Car의 isLeftGas() 메소드 호출
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요.");
		}
	}

}
