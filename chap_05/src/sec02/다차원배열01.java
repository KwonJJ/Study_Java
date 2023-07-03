package sec02;

public class 다차원배열01 {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][]; //2줄 짜리 계단식
		englishScores[0] = new int[2]; //첫 번째 줄은 2칸
		englishScores[1] = new int[3]; //두 번째 줄은 3칸
		
		
		for(int i = 0; i < englishScores.length; i++) {
			for(int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] koreanScores = new int[4][]; //4줄 짜리 계단식(3칸 4줄짜리 = 총 12칸)
		koreanScores[0] = new int[2]; //첫 번째 줄은 2칸
		koreanScores[1] = new int[3]; //두 번째 줄은 3칸
		koreanScores[2] = new int[1]; //세 번째 줄은 1칸
		koreanScores[3] = new int[3]; //네 번째 줄은 3칸
		
		
		for(int i = 0; i < koreanScores.length; i++) {
			for(int k = 0; k < koreanScores[i].length; k++) {
				System.out.println("koreanScores[" + i + "][" + k + "] = " + koreanScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] koreanScores2 = { {85, 93}, {72, 91, 88}, {66}, {55, 57, 99} }; //배열 칸수 안정하고 바로 대입
		for(int i = 0; i < koreanScores2.length; i++) {
			for(int k = 0; k < koreanScores2[i].length; k++) {
				System.out.println("koreanScores[" + i + "][" + k + "] = " + koreanScores2[i][k]);
			}
		}
		System.out.println();
	}

}
/* 
 * 
 */