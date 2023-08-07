package sec01;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("제목1 ", "내용 1 ", "글쓴이 1"));
		list.add(new Board("제목2 ", "내용 2 ", "글쓴이 2"));
		list.add(new Board("제목3 ", "내용 3 ", "글쓴이 3"));
		list.add(new Board("제목4 ", "내용 4 ", "글쓴이 4"));
		list.add(new Board("제목5 ", "내용 5 ", "글쓴이 5"));
		// Board 객체 저장
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer + "\t");
		}
		System.out.println();

		list.remove(2);
		// 2번 인덱스 객체(제목3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3);
		// 3번 인덱스 객체(제목5)삭제
		for(Board board2 : list) { 
			// 위의 Board 출력 구문 압축(이런 방식으로 많이 쓰임)
			System.out.println(board2.subject + "\t" + board2.content + "\t" + board2.writer + "\t");
		}
	}

}
