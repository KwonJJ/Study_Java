package sec02;


public class 배열08로또 {

	public static void main(String[] args) {

		int n = 0; // 번호 초기값 세팅
		int[] lotto = new int[6]; // 로또 번호가 들어갈 배열 생성
		boolean[] check = new boolean[46]; // 번호가 같은지 판단하는 배열 생성(true, false)
		//1 ~ 45가 필요하지만 배열은 0부터 시작하므로 총 46개 생성

		for (int i = 0; i < lotto.length; i++) { //총 6개 숫자 추출
			n = (int) (Math.random() * 45) + 1; //랜덤 숫자 추출해서 n에 저장
			
			if(check[n] == false) {
				/*
				 * boolean은 초기값이 false로 되어있음
				 * 랜덤 숫자 자리를 뽑은 적이 없으면 해당 숫자 추출하고
				 * 해당 자리값을 true로 변경함
				 */
				lotto[i] = n; //랜덤 숫자 나오면 lotto[i]에 값 넣음
				check[n] = true; //랜덤 숫자가 같은 숫자일 시 true로 바꿔서 반복된 숫자 제거
			}
			else {
				i--; //똑같은 숫자가 나오면 다시 숫자 생성
			}
		}
		// <선생님의 로또 출력 방식>
		  for(int j = 0; j < lotto.length; j++) {
			  System.out.print(lotto[j] + " ");
			  
		}
	}
}
/*
 * 로또 숫자 중복 제거
 */
