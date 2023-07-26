package sec01_checkProblem;

public class ByteToStringExam {

	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		
		String str = new String(bytes);
		
		System.out.println(str);
	}

}
/* 
 * 주어진 바이틀 배열{...}을 문자열로 변환
 */