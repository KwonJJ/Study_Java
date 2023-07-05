package sec02;

public class 필드초기값예제01 {

	public static void main(String[] args) {
		필드초기값 fiv = new 필드초기값();
		
		System.out.println("byteField : " + fiv.byteField); // 초기값 0
		System.out.println("shortField : " + fiv.shortField); // 초기값 0
		System.out.println("intField : " + fiv.intField); // 초기값 0
		System.out.println("longField : " + fiv.longField); // 초기값 0
		
		System.out.println("booleanField : " + fiv.booleanField); // 초기값 false
		System.out.println("charField : " + fiv.charField); // 초기값 : 아무것도 안잡힘

		System.out.println("floatField : " + fiv.floatField); // 초기값 0.0
		System.out.println("doubleField : " + fiv.doubleField); // 초기값 0.0
		
		
		System.out.println("arrField : " + fiv.arrField); // 초기값 null
		System.out.println("referenceField : " + fiv.referenceField); // 초기값 null
	}

}
