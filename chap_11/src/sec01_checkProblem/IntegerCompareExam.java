package sec01_checkProblem;

public class IntegerCompareExam {

	public static void main(String[] args) {
		
		// Integer n1 = new Integer(100); -> 정식 박싱 코드
		
		Integer n1 = 100; // Wrapper 클래스 Integer는 byte까지만 숫자로 인식 가능(그 외엔 equals로 비교)
		Integer n2 = 100;
		Integer n3 = 300;
		Integer n4 = 300;
		// 자동 박싱
		
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		System.out.println(n3.equals(n4));
	}

}
