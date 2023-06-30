package sec02;

public class 배열02 {

	public static void main(String[] args) {
		/*
		int[] a; //배열 생성1
		int b[]; //배열 생성2(둘 다 가능)  ( []int a; -> 불가능 )
		String c[];
		//배열 선언문
		*/
		int d[] = {51, 82, 96, 77, 66}; //배열 선언 및 대입
		
		int sum = 0;
		// 배열의 전체 합계와 평균을 구하기
		// 평균은 double
		// for필요
		
		for(int i = 0; i < 5; i++) {
			sum += d[i];
		}
		System.out.printf("총합 = %d\n", sum);
		
		double avg = (double) sum / 5;
		System.out.printf("평균 = %2.1f\n", avg);

		int t[];
		// t = {1, 2, 3}; -> 컴파일 에러 발생
		
		int s[] = null;
		s = new int[]{1, 2, 3}; 
		// 배열은 참조타입이라 항상 참조할 부분을 생성 해줘야 에러 발생 안함.
		// ex) new 변수[]{};
		
		int p[] = new int[] {1, 2, 3}; //배열 방식1
		int q[] = {4, 5, 6}; //배열 방식 2
	}

}
/* 배열(for나 반복문이 필수임)\
 * 데이터를 연속된 공간에 나열, 각 데이터에 인덱스(index)를 부여한 자료구조
 * 특징 ->
 * 1. 같은 타입의 데이터만 저장할 수 있음
 * 2. 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없음
 */