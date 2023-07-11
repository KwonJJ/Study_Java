package sec01;

public class Computer {
	String company;
	String monitorCompany;
	String price;
	
	void price(String money) {System.out.println("컴퓨터의 가격은" + money + "입니다.");}
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void gameOn(String gameName) {System.out.println(gameName + "을 켭니다");}
	void gameOff(String gameName) {System.out.println(gameName + "을 끕니다.");}
	void internetOn(String web) {System.out.println(web + "를 킵니다.");}
	void internetOff(String web) {System.out.println(web + "를 끕니다.");}
}
