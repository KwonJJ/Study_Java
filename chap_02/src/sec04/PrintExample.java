package sec04;
/*
 * System.out.printf("형식문자열", 값1, 값2, ...) 
->괄호 안의 첫 번째 문자열 형식대로 내용을 출력
(지정한 형식에 맞게끔 출력)

System.out.printf("이름 : %s", "감자바");
-> 이름 : 감자바
System.out.printf("나이 : %d", 25);
-> 나이 : 25
%와 conversion은 필수로 작성하고 그 외 항목은 생략가능
% = 형식 문자열의 시작을 뜻함.
conversion에 제공되는 값의 타입에 따라
d(정수), f(실수), s(문자열)을 입력

System.in.read()

 */
public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value); // 정수 형태로 출력
		System.out.printf("상품의 가격 : %6d원\n", value); // 6자리 정수, 왼쪽 빈 자리 공백
		int value1 = 1234;
		System.out.printf("상품의 가격 : %-6d원\n", value1); // 6자리 정수, 오른쪽 빈 자리 공백
		System.out.printf("상품의 가격 : %06d원\n", value1); // 6자리 정수, 왼쪽 빈 자리 0 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area); //전체 자리수 10자리 + 소수점 2자리 출력
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); //6칸 | 왼쪽 정렬 + 오른쪽 공백 | 왼쪽 공백 + 오른쪽 정렬
	}

}
