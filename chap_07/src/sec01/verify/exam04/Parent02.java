package sec01.verify.exam04;

public class Parent02 {
	public String nation;
	
	public Parent02() {
		this("대한민국"); // 본인꺼 호출
		System.out.println("Parent() call");
	}
	
	public Parent02(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
