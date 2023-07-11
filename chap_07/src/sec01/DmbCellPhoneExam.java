package sec01;

public class DmbCellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10); // DmbCellPhone 객체 생성
		
		System.out.println("모델 : " + dmbCellPhone.model); //CellPhone 클래스로부터 상속받은 필드
		System.out.println("색상 : " + dmbCellPhone.color); //CellPhone 클래스로부터 상속받은 필드
		
		System.out.println("채널 : " + dmbCellPhone.channel); //DmbCellPhone 클래스의 필드
		

		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn(); // 상속 받은 메소드 출력
		dmbCellPhone.bell(); // 상속 받은 메소드 출력
		dmbCellPhone.sendVoice("여보세요."); // 상속 받은 메소드 출력
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요."); // 상속 받은 메소드 출력
		dmbCellPhone.sendVoice("아~ 예 반갑습니다."); // 상속 받은 메소드 출력
		dmbCellPhone.hangUp(); // 상속 받은 메소드 출력
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb(); // 자기 메소드 출력(상속받은거 아님)
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
