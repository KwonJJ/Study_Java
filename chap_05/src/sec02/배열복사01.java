package sec02;

public class 배열복사01 {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i < newIntArray.length; i++) {
			if(i < newIntArray.length - 1) { //newIntArray - 1이 증감되는 i보다 작을 때 ,를 붙여서 마지막에 ,를 뺌
			System.out.print(newIntArray[i] + ",");
			}else {
				System.out.print(newIntArray[i]);
			}
		}
	}

}
/* 
 * 
 */