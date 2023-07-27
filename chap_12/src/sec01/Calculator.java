package sec01;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		this.memory = memory; // 매개값을 memory필드에 저장
		try { // 딜레이 안주면 User1 : 100, User2 : 50이 출력됨
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		} // 스레드를 2초간 일시정지
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		// Thread.currentThread().getName() -> 스레드 이름 얻기
		// this.memory -> 메모리값
	}

}
