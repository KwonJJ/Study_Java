package FoodOrder;

public class Menu {
	String menuName; // 메뉴
	int cost; // 가격

	public Menu() {

	}

	public Menu(String menuName, int cost) {
		this.menuName = menuName;
		this.cost = cost;
	}

	public Menu(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "상품명 : " + menuName + " 가격 : " + cost + "원 \n"; 
		// 상품명 : + 가격 출력
	}
	
	public void output() {
		System.out.println(toString());
	}
}
