package sec02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++; //선증감
		++x; //후증감
		System.out.println("x = " + x);

		System.out.println("--------------------");
		y++; //선증감
		++y; //후증감
		System.out.println("y = " + y);
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);

		System.out.println("--------------------");
		z = ++x; //z = 14(선증감)
		System.out.println("z = " + z);
		System.out.println("x = " + x );
		// x = 14, y = 8, z = 14
		
		System.out.println("--------------------");
		z = ++x + y++; //x(선증감), y(후증감) 15 + 8
		System.out.println("z = " + z);
		System.out.println("x = " + x ); //15
		System.out.println("y = " + y ); //9
		
		
		
	}

}
