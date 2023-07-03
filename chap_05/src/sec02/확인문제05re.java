package sec02;

import java.util.Scanner;

public class 확인문제05re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열 개수 입력 : \n");
		int n = s.nextInt();
		int[] array = new int[n]; //정수타입 배열변수 array에 입력한 배열 개수 삽입
		
		for(int i = 0; i < array.length; i++) { //입력한 배열 개수보다 작을 때까지 1씩 증감
			System.out.printf("%d번째 숫자를 입력하세요.", i + 1); 
			array[i] = s.nextInt(); //입력한 숫자를 배열 개수에 삽입
		}
		
		int min = array[0]; //배열의 0번째 값을 min에 저장
		
		for(int j = 0; j < array.length; j++) { //입력한 배열 개수보다 작을 때까지 1씩 증감
			if(min > array[j]) { //min이 ??
				min = array[j];
			}
		}
		System.out.printf("최소값 = %d", min);

	}

}
/* 
 * 사용자로부터 배열 개수 입력받기
 * 배열 개수만큼 숫자를 입력 받아서 배열에 삽입
 * 
 * 해당 배열에서 가장 작은 숫자를 출력
 * (단, 숫자는 양수만 가능)
 */