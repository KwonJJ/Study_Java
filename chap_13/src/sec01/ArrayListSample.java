package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java"); // 0번방
		list.add("JDBC"); // 1번방
		list.add("Servlet/JSP"); // 2번방
		list.add(2, "Database"); // 2번방에 Database 추가하면 원래 있던 Servlet/JSP이 밀려서 3번이 됨
		list.add("IBATIS"); // 4번방
		// String객체를 저장
		
		int size = list.size(); // 저장된 총 객체수
		System.out.println("총 객체수 : " + size);
		System.out.println();

		String skill = list.get(2); // 2번방 데이터 가져오기(2번 인덱스의 객체 얻기)
		System.out.println("2 : " + skill);
		
		for(int i = 0; i < list.size(); i++) { // 저장된 총 객체 수 만큼 반복
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2); // 2번방 데이터 삭제(Database)
		list.remove(2); // 2번방 데이터 삭제(Servlet/JSP)
		list.remove("IBATIS"); // 내용으로 삭제 가능
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
