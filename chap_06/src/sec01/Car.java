package sec01;

public class Car {
	int speed;
	String company;
	int price;
	String color;
	
	public Car() {
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
/* 
 * 필드 -> speed, company, price, color
 * 
 * 해당 클래스의 생성자를 만들고
 * 
 * 해당 클래스의 필드로 메소드를 각각 만들기 (get, set)
 */