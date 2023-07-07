package sec04;

public class 확인문제03출력 {

	public static void main(String[] args) {
		확인문제03 memberService = new 확인문제03();

		boolean result = memberService.login("hong", "12345");

		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 passwird가 올바르지 않습니다.");

		}

	}
}