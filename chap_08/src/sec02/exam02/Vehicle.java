package sec02.exam02;

public interface Vehicle {
	/*
	 * 인터페이스의 목적은 가져다 쓸 목적임(private붙이면 안됨)
	 * 인터페이스 필드는 상수 필드만 가능함
	 * 만약 쓴다면 변수명은 반드시 대문자 + 값을 넣어줘야함
	 * 
	 * int WHEELS = 4; -> public static final 생략됨
	 * */
	
	
	public void run();
	/*
	 * 인터페이스 메소드이므로 추상 메소드
	 * static abstract 생략됨
	 */
}
