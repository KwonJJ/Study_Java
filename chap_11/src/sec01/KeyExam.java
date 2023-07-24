package sec01;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// Key객체를 식별키로 사용해서 String값을 저장하는 HashMap객체 생성
		
		hashMap.put(new Key(1), "홍길동");
		// 식별키 new Key(1)로 "홍길동"을 저장
		
		String value = hashMap.get(new Key(1));
		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		System.out.println(value);
	}

}
