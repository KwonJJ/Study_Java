package problem01;


public class 끝말잇기 extends Player {

	public static void main(String[] args) {
		Player player = new Player();
		
		player.start();
		
		// game
		String[] gameStart = new String[2]; // 2개짜리 방 배열 생성
		gameStart[0] = "아버지"; // 0번 방 배열에 "아버지" 저장
		System.out.printf("시작 단어는 %s입니다. \n", gameStart[0]);
		
		char startWord = gameStart[0].charAt(2); // startWord변수에 아버지 글자 중 마지막 글자 "지"추출
		
	}

}
/* 
 * 끝말잇기(스캐너 필수)
 * "그만"할 때까지 반복
 * 게임에 참가하는 인원 몇명?
 * ex.2명 일때 참가자 이름 입력(홍길동, 흥부)
 * 
 * 시작하는 단어는 "아버지"입니다
 * 배열 0번째 방부터 시작
 * 홍길동 : 지성
 * 흥부 : 성공
 * 홍길동 : 공부
 * 흥부 : 부질없음
 * 홍길동 : 음악
 * -> 홍길동이 졌습니다.
 * 
 * 1. 반복(인원수에 맞게끔 (배열)이름 뜨고 입력하면 넘어가게 하기

 */