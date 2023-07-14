package problem01;

import java.util.Scanner;

public class Player {
	Scanner s = new Scanner(System.in);
	
	int count; // 인원수

	void start() {
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
		count = s.nextInt();
		int[] people = new int[count]; // 스캐너에 입력한 인원을 people배열에 저장
		
		for(int i = 0; i < people.length; i++) { // 입력한 인원 수보다 작을 때까지 반복
			System.out.print("참가자의 이름을 입력하세요. >> ");
			String name = s.next();
			String[] nameArray = {name}; // 입력한 참가자 이름을 배열에 저장
		}
	}
}
