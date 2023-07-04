package sec03;

import java.util.Calendar;

public class 열거형예제02 {

	public static void main(String[] args) {
		Part month = null;
		
		Calendar cal = Calendar.getInstance(); //컴퓨터에서 현재 날짜 정보를 가져옴
		
		int m = cal.get(Calendar.MONTH) + 1; 
		//1 ~ 12(월) 숫자를 변수 m에 저장(캘린더엔 0 ~ 11까지 저장되있어서 + 1을 해줘야 1 ~ 12가 됨
		
		switch(m) { //if로 한다면 3이하, 6이하, 9이하, 12이하로 하면 됨.
		case 1 :
		case 2 :
		case 3 :
			month = Part.일사분기;
			break;
		
		case 4 :
		case 5 :
		case 6 :
			month = Part.이사분기;
			break;
		
		case 7 :
		case 8 :
		case 9 :
			month = Part.삼사분기;
			break;
		
		case 10 :
		case 11 :
		case 12 :
			month = Part.사사분기;
			
		}
		System.out.println("현재 월은 " + month + "입니다.");
		
		for(int i = 1; i <= m; i++) {
			if(m <= 3) {
				month = Part.일사분기;
				System.out.println("현재 월은" + month + "입니다.");
				break;
			}
			if(m > 3 && m <= 6) {
				month = Part.이사분기;
				System.out.println("현재 월은 " + month + "입니다.");
				break;
			}
			if(m > 6 && m <= 9) {
				month = Part.삼사분기;
				System.out.println("현재 월은 " + month + "입니다.");
				break;
			}
			if(m > 9 && m <= 12) {
				month = Part.사사분기;
				System.out.println("현재 월은 " + month + "입니다.");
				break;
			}
		}
	}

}
