package sec02;

public class 배열복사02 {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length); //자동으로 배열 복사
		//oldIntArray 복사 -> 0부터 시작
		//newIntArray 복사 -> 0부터 시작
		//마지막 oldIntArray.length는 복사할 개수
		/*System.arraycopy(src, srcPos, dest, destPos, length);
		 * src = 원본 배열
		 * srcPos = 원본 배열에서 복사할 항목의 시작 인덱스
		 * dest = 새 배열
		 * destPos = 새 배열에서 붙여넣을 시작 인덱스
		 * 새 배열 변수.length = 복사할 개수
		 */
		
		for(int i = 0; i < oldIntArray.length; i++) { //수동으로 배열 복사
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i < newIntArray.length; i++) {
			if(i < newIntArray.length - 1) { //newIntArray - 1이 증감되는 i보다 작을 때까지만 ,를 붙이고 마지막에 ,를 뺌
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