package sec01;

public class ComputerExam {

	public static void main(String[] args) {
		Notebook pc = new Notebook("ASUS", "알파스캔", "300만원"); // 객체 생성

		System.out.println("컴퓨터 가격 : " + pc.price); // Computer(부모)클래스에서 상속받은 필드 출력
		System.out.println("제조 회사 : " + pc.company); // Computer(부모)클래스에서 상속받은 필드출력
		System.out.println("모니터 회사 : " + pc.monitorCompany); // Computer(부모)클래스에서 상속받은 필드 출력
		
		pc.cpu("AMD"); 
		
		String GPU = pc.gpu("rtx4080 그래픽카드"); // GPU변수에 Notebook클래스의 gpu메소드 저장
		System.out.println(GPU);
	}

}
