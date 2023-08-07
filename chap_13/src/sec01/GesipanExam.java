package sec01;

import java.util.ArrayList;
import java.util.List;

public class GesipanExam {

	public static void main(String[] args) {
		List<Gesipan> list = new ArrayList<>();
		// List에 클래스 타입으로 Gesipan으로 선언
		
		list.add(new Gesipan(1, "8월 초 수업 일정", "자바 개인 프로젝트 발표", "홍길동"));
		list.add(new Gesipan(2, "9월 수업 일정", "데이터 베이스", "홍길동"));
		list.add(new Gesipan(3, "10월 수업 일정", "JSP", "홍길동"));
		list.add(new Gesipan(4, "11월 수업 일정", "팀 프로젝트 준비", "홍길동"));
		
		for(int i = 0; i < list.size(); i++) {
			Gesipan gesi = list.get(i);
			// 클래스 타입으로 선언했기 때문에 클래스 방식으로 해야됨.
			System.out.println(gesi.number + " " + gesi.subject + " " + gesi.content + " " + gesi.user + " ");
		}
	}

}
