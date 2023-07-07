package sec04;

public class 확인문제03 {
	boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
