package sec02.exam03;

public class 문자연습02 {

	public static void main(String[] args) {
		String name = "장동건";
		String job = "배우";
		System.out.println(name + "은 " + job + "입니다.");
		
		String str = "나는 \"자바\"를 좋아합니다."; //이스케이프 문자
		//String str = "나는 "자바"를 좋아합니다."; ->오류 발생
		System.out.println(str);
		
		String str2 = "번호\t이름\t나이"; //이스케이프 문자
		System.out.println(str2);
		
		String str3 = "번호\n이름\n나이"; //이스케이프 문자
		System.out.println(str3);
	}

}
