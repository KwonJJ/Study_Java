package sec01;

public class ComputerExam02 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator02 calculator = new Calculator02(); // 부모(Calculator02) 호출
		System.out.println("원의 면적 : " + calculator.areaCircle02(r));

		Computer02 computer = new Computer02(); // 자식(Computer02) 호출
		System.out.println("원의 면적 : " + computer.areaCircle02(r));
	}

}
