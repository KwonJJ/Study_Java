package sec02.test01;

public class function extends lemokeon {
	String gameController;
	String tvControl;
	String fanControl;
	
	@Override
	void powerOff() {
		System.out.println("건전지를 교체하세요.");
	}

	@Override
	void channel() {
		System.out.println("기기를 변경합니다.");
	}
	
	
}
