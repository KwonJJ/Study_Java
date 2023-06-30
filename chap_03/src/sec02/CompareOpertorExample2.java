package sec02;

public class CompareOpertorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //int와 double 비교시 int는 double로 자동 형변환
		System.out.println(v2);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //float은 자동 형변환X , 정수부분(1.0)이 같으면 true나오지만 소수점 부분이 다르기 때문에 false나옴
		System.out.println((float)v4 == v5); //float로 형변환 시켜야 정상이 됨
	}

}
