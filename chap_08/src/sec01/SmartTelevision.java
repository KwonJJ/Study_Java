package sec01;

public class SmartTelevision implements RemoteControl, Searchable {
	// 인터페이스를 중첩으로 구현함

	private int volume;

	public void search(String url) { //Searchable의 추상 메소드의 실체 메소드
		System.out.println(url + "을 검색합니다.");
	}
	public void turnOn() { // RemoteControl의 추상 메소드 3개의 실체 메소드
		System.out.println("스마트 TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}

	public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨 : " + this.volume);
		}
	}
