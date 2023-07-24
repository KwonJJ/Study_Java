package sec01;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;

			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	/*
	@Override
	public int hashCode() { // 오버라이드 하면 메인구문에 "홍길동"출력, 안하면 null값 출력됨
		return number;
	}
	*/
}
