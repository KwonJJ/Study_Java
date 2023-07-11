package sec01;

public class DmbCellPhone extends CellPhone{ //DmbCellPhone클래스에 CellPhone클래스 상속
	int channel; // 멤버 필드

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model; // (CellPhone클래스에서)상속 받은 필드
		this.color = color; // (CellPhone클래스에서)상속 받은 필드
		this.channel = channel;
	}
	
	void turnOnDmb() { // 메소드
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) { // 메소드
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() { // 메소드
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
