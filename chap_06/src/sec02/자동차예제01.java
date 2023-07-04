package sec02;

public class 자동차예제01 {

	public static void main(String[] args) {
		Car myCar = new Car(); //Car 객체 생성, 인스턴스 이름 = myCar
		
		//Car객체에서 가져오고 싶으면 (형식 = 인스턴스 이름.가져올 Car객체에서 가져올 값) 형식으로 쓰면 됨.
		
		System.out.println("회사 이름 : " + myCar.company); //Car객체에서 가져옴
		System.out.println("모델명 : " + myCar.model); //Car객체에서 가져옴
		
		myCar.company = "페라리"; //여기에서 Car객체 변경 가능
		myCar.model = "아벤타도르"; //여기에서 Car객체 변경 가능

		System.out.println("회사 이름 : " + myCar.company); //변경된 Car객체 출력
		System.out.println("모델명 : " + myCar.model); //변경된 Car객체 출력
	}

}
