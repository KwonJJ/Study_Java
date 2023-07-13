package sec02.problem;

public class SnowTire extends Tire	{
	String windage; // 타이어 공기압
	
	
	@Override // 헷갈리지 말자는 표식
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}

	public void stop() { // @Override를 안하다라도 컴파일할 때 컴퓨터가 자동으로 해줌
		System.out.println("스노우 타이어가 멈춥니다.");
	}

	public String stop(int x) { // @Override를 안하다라도 컴파일할 때 컴퓨터가 자동으로 해줌
		String result = "스노우 타이어가 멈춥니다.";
		return result;
	}

	@Override
	void tireCompany() {
		System.out.println("한국 타이어입니다.");
	}


	@Override
	void tireCar() {
		System.out.println("세단 전용 타이어입니다.");
	}
	
}
