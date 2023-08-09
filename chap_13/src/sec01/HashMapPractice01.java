package sec01;

import java.util.*;

public class HashMapPractice01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 1; i <= 3; i++) {
			System.out.println("나라, 인구수 입력 >> ");
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.print("나라 이름 입력 : ");
			String country = s.next();

			if (country.equals("그만")) {
				System.out.println("검색 종료");
				break;
			}

			if (map.containsKey(country)) {
				System.out.println("해당 나라의 인구 수는 " + map.get(country));
			} else {
				System.out.println("해당 나라가 없습니다.");
			}
		}

	}
}

/* 
 * 나라와 인구수를 스캐너를 이용해 3개를 입력 받기
 * ex) 한국 5000, 일본 12000, 중국 30000
 * 해당 데이터를 해시맵으로 저장한 후
 * 사용자가 나라 이름을 입력하면 인구수를 출력하는 코드 작성
 * 사용자가 그만이라고 입력하면 중지
 */