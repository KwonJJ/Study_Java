package 보강02;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10); // 배열의 개수 -> 10개
		
		dic.put("홍길동", "자바");
		dic.put("김길동", "파이선");
		dic.put("김길동", "C");
		
		System.out.println("홍길동의 값은 " + dic.get("홍길동"));
		System.out.println("김길동의 값은 " + dic.get("김길동"));
		
		dic.delete("홍길동"); // 황기태 아이템 삭제
		
		System.out.println("홍길동의 값은 " + dic.get("홍길동"));

	}

}
