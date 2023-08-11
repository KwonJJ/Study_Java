package sec02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExam {

	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		for (Board board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}
	}

	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "제목 1", "내용 1", "글쓴이 1", new Date()));
		list.add(new Board(2, "제목 2", "내용 2", "글쓴이 2", new Date()));
		list.add(new Board(3, "제목 3", "내용 3", "글쓴이 3", new Date()));

		FileOutputStream fos = new FileOutputStream("c:/temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}

}
