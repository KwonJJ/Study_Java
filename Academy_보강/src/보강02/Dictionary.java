package 보강02;

public class Dictionary extends PairMap {
	private int set; // 데이터 추가한 후 배열 번호를 증가시키기 위한 값

	public Dictionary(int num) {
		// 매개변수 1개짜리 리턴값 num인 생성자
		KeyArray = new String[num];
		valueArray = new String[num];
		this.set = 0; // 배열 번호의 초기값 설정
	}

	public String get(String key) { // key(이름)으로 값(과목)을 검색하는 메소드
		// key값을 가져오는 메소드
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // 원하는 key가 없다면 null 리턴
	}

	public void put(String key, String value) { 
		/*
		 * 입력받은 key(이름)와 값(과목)을 이용하여 배열에 추가
		 * 단, key(이름)가 중복되면 기존꺼 변경
		 */
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return; // 중복된 key가 있다면 저장하고 함수 종료
			}
		}
		KeyArray[set] = key; // 새로운 배열 방에 입력된 값 추가
		valueArray[set] = value;
		set++; // 배열의 방번호 증가
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				return s; // 삭제된 value 값 리턴
			}
		}
		return null; // 삭제된 것이 없다면 null 리턴
	}

	public int length() {
		return set;
	}
}
