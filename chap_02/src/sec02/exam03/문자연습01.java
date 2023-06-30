package sec02.exam03;

public class 문자연습01 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		int c3 = c2;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		/*코드표를 검색하여 화면상에 다음과 같이 출력
		 * char 변수 a,b,c,d 4개를 생성하여 
		 * 각각 G, o, o, d에 해당하는 숫자를 대입
		 * 화면상 -> Good
		 */
		
		char a = 71, b = 111, c = 111, d = 100;
		System.out.print(a); //ln = 라인 println은 다음줄로 넘어감
		System.out.print(b); //ln을 빼고 print만 입력하면 연결되서 출력
		System.out.print(c);
		System.out.print(d);
		
	}

}
