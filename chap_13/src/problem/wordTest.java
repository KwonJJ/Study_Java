package problem;

import java.util.*;

public class wordTest {
	List<word> list = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	int[] question = new int[4];

	public wordTest() {
		list.add(new word("love", "사랑"));
		list.add(new word("painting", "그림"));
		list.add(new word("bear", "곰"));
		list.add(new word("eye", "눈"));
		list.add(new word("society", "사회"));
		list.add(new word("human", "인간"));
		list.add(new word("picture", "사진"));
		list.add(new word("apple", "사과"));
		list.add(new word("head", "머리"));
		list.add(new word("water", "물"));
		list.add(new word("nose", "코"));
		list.add(new word("book", "책"));
		list.add(new word("pencil", "연필"));
		list.add(new word("cookie", "쿠키"));
		list.add(new word("rainbow", "무지개"));
		list.add(new word("honey", "꿀"));
		list.add(new word("fire", "불"));
	}

	public void run() {
		System.out.println("누가누가 잘 맞추나 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다.");
		System.out.println("현재 " + list.size() + "개의 단어가 들어 있습니다.");
		System.out.println();

		int num = 0;

		while (true) {
			randomQuiz(); // 랜덤한 값을 가진 문제 배열 생성 메소드 호출
			int answerNumber = (int) (Math.random() * question.length);
			// 0 ~ 3 중 한 값을 정답 번호로 저장

			int answerIndex = question[answerNumber];
			// 정답번호의 배열에 있는 값이 정답

			System.out.println(list.get(answerIndex).getEnglish() + " ? ");
			// 정답의 영단어를 호출해 문제로 출제

			for (int i = 0; i < question.length; i++) {
				// 4개의 보기를 만들기 위한 반복문
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKorean() + " ");
				// 0 ~ 3까지 배열에 값을 넣어 각 인덱스의 보기 출력
			}
			System.out.print(">> ");

			int input = s.nextInt();

			if (input == -1) {
				System.out.println("지금까지 " + num + "개의 정답을 맞췄습니다.");
				System.out.println("게임을 종료합니다...");
				break;
			} else if (input - 1 == answerNumber) {
				System.out.println("정답입니다.");
				System.out.println();
				num++;
			} else {
				System.out.println("오답입니다.");
				System.out.println();
			}
		}
	}

	public void randomQuiz() {
		// 4개의 보기에 임의의 Array인덱스를 주기 위한 메소드
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0 ~ 문제의 개수(Array사이즈) 중 임의의 값 저장

			for (int j = 0; j < i; j++) {
				// 중복된 값은 없도록 처리
				if (question[i] == question[j]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		wordTest w = new wordTest();
		w.run();
	}
}
/* 
 * "누가 잘 맞추나" 단어 테스트
 * -1을 입력하면 종료
 * 
 * ex)
 * society ? 
 * (1)사회 (2)동물 (3)사랑 (4)눈 >> 1
 * 정답입니다.
 * 
 * dall ?
 * (1)감정 (2)주식 (3)인형 (4)조각상 >> 4
 * 오답입니다.
 * 
 * honey ?
 * (1)거래 (2)꿀 (3)사랑 (4)아기 >> -1
 * "누가 잘 맞추나"를 종료합니다.
 */