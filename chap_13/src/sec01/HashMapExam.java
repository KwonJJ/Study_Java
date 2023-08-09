package sec01;

import java.util.*;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일한 키가 있으면 마지막에 저장한 값으로 기존 값 대체
		System.out.println("총 Entry 수 : " + map.size() + "개"); // 저장된 총 Entry개수

		System.out.println("홍길동 점수 : " + map.get("홍길동"));
		// 이름(키)으로 점수(값)을 검색
		System.out.println();

		Set<String> keySet = map.keySet();
		// 키 값 모두 가져오기(85, 90, 95)
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			// 반복해서 키를 얻고 값을 Map에서 얻어냄
			String key = keyIterator.next(); // 반복해서 키 가져옴
			Integer value = map.get(key); // 반복해서 값 가져옴
			System.out.println(key + " : " + value);
		}

		map.remove("홍길동"); // 홍길동 제거(남은 키<85, 80>)
		System.out.println("총 Entry 수 : " + map.size() + "개");
		System.out.println();
		// --------------------- 첫 번째 방법 --------------------

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		// --------------------- 두 번째 방법 --------------------
	}

}
