package sec01;

public class 숫자변환예외예제 {

	public static void main(String[] args) {
		String n1 = "100";
		
		int n2 = Integer.parseInt(n1);
		
		System.out.println(n2);
		
		String n3 = "가나다";
		int n4 = Integer.parseInt(n3);
		System.out.println(n4);
	}

}
