package sec01_problem;

import java.util.*;

public class 시간맞추기게임 {

	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine();

		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);

		System.out.println("현재 시간 : " + time + "초 입니다.");
		return time;
	}
}