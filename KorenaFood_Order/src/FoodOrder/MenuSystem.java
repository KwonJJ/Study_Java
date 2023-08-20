package FoodOrder;

import java.awt.Image;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MenuSystem {
	static Vector<Menu> main = new Vector<Menu>();
	static Vector<Menu> side = new Vector<Menu>();
	static Vector<Menu> set = new Vector<Menu>();
	static Vector<Menu> drink = new Vector<Menu>();
	static Vector<Menu> alcohol = new Vector<Menu>();
	static Vector<Menu> order = new Vector<Menu>();
	static Vector<Integer> cost = new Vector<Integer>();

	private static void addCost(Integer new_cost) { // 가격 추가
		cost.add(new_cost);
	}

	private static void addMainMenu(Menu new_Main) { // 메인메뉴 추가
		main.add(new_Main);
	}

	private static void addSideMenu(Menu new_Side) { // 사이드메뉴 추가
		side.add(new_Side);
	}

	private static void addSetMenu(Menu new_Set) { // 세트메뉴 추가
		set.add(new_Set);
	}

	private static void addDrink(Menu new_Drink) { // 음료 추가
		drink.add(new_Drink);
	}

	private static void addAlcohol(Menu new_Alcohol) { // 주류 추가
		alcohol.add(new_Alcohol);
	}

	static Menu newMainMenu(String menuName, int cost) {
		Menu newMainMenu = new Menu(menuName, cost);
		MenuSystem.addMainMenu(newMainMenu);
		return newMainMenu;
	}

	static Menu newSideMenu(String menuName, int cost) {
		Menu newSideMenu = new Menu(menuName, cost);
		MenuSystem.addSideMenu(newSideMenu);
		return newSideMenu;
	}

	static Menu newSetMenu(String menuName, int cost) {
		Menu newSetMenu = new Menu(menuName, cost);
		MenuSystem.addSetMenu(newSetMenu);
		return newSetMenu;
	}

	static Menu newDrink(String menuName, int cost) {
		Menu newDrink = new Menu(menuName, cost);
		MenuSystem.addDrink(newDrink);
		return newDrink;
	}

	static Menu newAlcohol(String Alcohol, int cost) {
		Menu newAlcohol = new Menu(Alcohol, cost);
		MenuSystem.addAlcohol(newAlcohol);
		return newAlcohol;
	}

	static Integer newCost(int cost) {
		Integer newCost = new Integer(cost);
		MenuSystem.addCost(newCost);
		return newCost;
	}

	static void settingMenu() {
		MenuSystem.newMainMenu("뚝배기 김치찜", 8000);
		MenuSystem.newMainMenu("돌솥비빔밥", 7500);
		MenuSystem.newMainMenu("돌솥소고기콩나물비빔밥", 7500);
		MenuSystem.newMainMenu("뚝배기불고기", 8000);
		MenuSystem.newMainMenu("사골만두국 + 밥 반공기", 7000);
		MenuSystem.newMainMenu("사골떡만두국 + 밥 반공기", 7500);
		MenuSystem.newMainMenu("불고기덮밥", 8000);
		MenuSystem.newMainMenu("삼계탕", 13000);
		MenuSystem.newSideMenu("철판불고기", 14000);
		MenuSystem.newSideMenu("수제떡갈비", 12000);
		MenuSystem.newSideMenu("접시왕만두(4pcs)", 5000);
		MenuSystem.newSideMenu("김치메밀전병", 6000);
		MenuSystem.newAlcohol("소주", 4000);
		MenuSystem.newAlcohol("카스", 4000);
		MenuSystem.newAlcohol("하이네켄(Heineken)", 8000);
		MenuSystem.newAlcohol("막걸리 Medium", 4000);
		MenuSystem.newAlcohol("막걸리 Large", 7000);
		MenuSystem.newDrink("우롱차", 2000);
		MenuSystem.newDrink("콜라", 2000);
		MenuSystem.newDrink("사이다", 2000);
	}

	static Icon iconSize(ImageIcon icon, int sizeWidth, int sizeHeight) {
		// 이미지 크기 조절
		Image img = icon.getImage();
		Image sizeImage = img.getScaledInstance(sizeWidth, sizeHeight, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(sizeImage);
	}

	static Menu getOrder(int witch) {
		return order.elementAt(witch);
	}

	static int getNumOrders() {
		return order.size();
	}

	static int getNumCost() {
		return cost.size();
	}

	static Integer getCost(int witch) {
		return cost.elementAt(witch);
	}

	static Integer get_Cost(int witch) {
		return cost.get(witch);
	}

	static String Custom_Order() {
		Menu money;
		System.out.println("-- 모든 주문 리스트 --");

		for (int i = 0; i < MenuSystem.getNumOrders(); i++) {
			money = MenuSystem.getOrder(i);
			System.out.println(i + 1 + ", ");
			money.output();
		}
		return null;
	}

	static String total_Cost(int sum) {
		sum = 0;
		int money;
		for (int i = 0; i < MenuSystem.getNumCost(); i++) {
			money = MenuSystem.getCost(i);
			sum = sum + money;
		}
		return "총 가격 : " + sum + "원";
	}

	@SuppressWarnings("unused")
	private static void new_Order_MainMenu(Menu newMainMenu) {
		order.add(newMainMenu);
	}

	public static void main(String[] args) {
		Custom_Order();
		cost.get(1);
	}
}
