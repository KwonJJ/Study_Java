package sec02;

import java.util.Scanner;

public class 배열복사03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] name = new String[3];

		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 입력 : ");
			name[i] = s.next();
		}

		String[] newName = new String[5];
		System.arraycopy(name, 0, newName, 0, name.length);

		for (int i = 0; i < newName.length; i++) {
			if (i >= 3) { // null값에 영수 넣기
				newName[i] = "영수";
			}
			System.out.println(newName[i]);
		}
	}

}
/* 
 * 사용자에게 3명의 이름을 입력받아 배열에 저장
 * String타입의 5개짜리 배열을 별도로 생성
 * 첫 번째 배열에서 두 번째 배열의 값을 복사
 * 
 * ex) 
 * 두 번재 배열에 철수, 영희, 순희, null, null
 * 두 번째 배열의 null값을 영수로 채우기.
 */