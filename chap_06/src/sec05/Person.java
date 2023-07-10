package sec05;

public class Person {
	final String NATION = "Korea";
	final String SSN;
	String name;
	
	public Person(String SSN, String name) {
		this.SSN = SSN;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		//p1.NATION = "usa"; -> fanal 객체는 변경 안됨
	}
	
}
