package sec01;

public class 배열범위예외예제 {

	public static void main(String[] args) {
		String[] a = new String[10];
		a[0] = "가나다";
		String data1 = a[0];
		// args라는 배열을 생성하지 않고 배열게 있는 값을 대입함.
		
		System.out.println("a[0] : " + data1);
		
		String data2 = args[0];
		String data3 = args[1];
		String data4 = args[2];
		
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		/*
		 * 에러 발생
		 * 메뉴 상단 Run -> Run Configurations -> Arguments -> Program arguments에 값 대입시
		 * 해당 에러 발생시 대입한 값 출력됨. 
		 * 실행환경 매개변수 
		 * 가나다 라마바 -> 2개로 처리
		 * "가나다 라마바" -> 1개로 처리 
		 */
	}

}
