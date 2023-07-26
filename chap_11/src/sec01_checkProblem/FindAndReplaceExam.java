package sec01_checkProblem;

public class FindAndReplaceExam {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다. ";
		
		int index = str.indexOf("자바");
		
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "Java"); 
			// replace()메소드 -> 첫 번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴
			
			System.out.println("--> " + str);
		}
	}

}
