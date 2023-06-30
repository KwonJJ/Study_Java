package sec02;

public class 배열01 {

	public static void main(String[] args) {
		int [] score = {50, 80, 90};
		
		for(int i = 0; i <= 2; i++) {
		System.out.println(score[i]);
		}
	}

}
/* 배열(for나 반복문이 필수임)
 * 데이터를 연속된 공간에 나열, 각 데이터에 인덱스(index)를 부여한 자료구조
 * 특징 ->
 * 1. 같은 타입의 데이터만 저장할 수 있음
 * 2. 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없음
 */