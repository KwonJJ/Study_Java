package sec01;

public class Notebook extends Computer{
	String CPU;
	String GPU;
	String Wifi;
	String camera;
	
	public Notebook(String company, String monitorCompany, String price) {
		this.company = company; // Computer부모 객체에서 상속받음
		this.monitorCompany = monitorCompany; // Computer부모 객체에서 상속받음
		this.price = price; // Computer부모 객체에서 상속받음
	}
	
	void cpu(String cpuCompany) {
		System.out.println("cpu 회사는" + cpuCompany + "입니다.");
	}
	
	String gpu(String gpuType) {
		String result = "그래픽 카드의 종류는 " + gpuType + "입니다.";
		return result;
	}
	
	void interConnect() {
		System.out.println("무선인터넷에 연결합니다.");
	}
	
	String mouseConnect() {
		String result = "무선 마우스를 연결합니다.";
		return result;
	}
	
	void airpotOn() {
		System.out.println("에어팟에 연결합니다.");
	}
	
	String airpotOff() {
		String result = "에어팟 연결을 해제합니다.";
		return result;
	}
}
