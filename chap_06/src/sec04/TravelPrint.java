package sec04;

import java.util.Scanner;

public class TravelPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Travel travel = new Travel();
		
		travel.setOil(20);
		travel.setLocation("광주");
		
		while(travel.isOilLeft()) {
			System.out.println("지역 입력 : ");
			String name = s.next();
			
			if(name.equals("서울")){
				travel.oilMinus(10);
				System.out.printf("현재 위치 : 서울\n현재 휘발유 잔여량 : %d\n\n", travel.oil);
			}
			else if(name.equals("부산")) {
				travel.oilMinus(5);
				System.out.printf("현재 위치 : 부산\n현재 휘발유 잔여량 : %d\n\n", travel.oil);
			}
			else if(name.equals("화순")) {
				travel.oilMinus(2);
				System.out.printf("현재 위치 : 화순\n현재 휘발유 잔여량 : %d\n\n", travel.oil);
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.\n");
			}
		}
	}

}
/* 
 * Travel클래스 생성
 * 맴버 변수 : oil, location선언
 * 초기값 : 20, 광주 (메인클래스에서 set메소드 활용)
 * 
 * setOil, setLocation으로 넣고
 * 불러올 땐 get이용(현재 위치)
 * 
 * 0은 boolean이용해서 0이 아니면 true, 0이면 false
 * 
 * 휘발유를 감소시키는 메소드 생성
 * -> travel클래스에서 void oilMinus로 생성
 * 
 * 만약 휘발유가 남았으면
 * "휘발유가 남았어요. 계속 여행하세요." 출력
 * 없으면
 * "휘발유가 없어요. 여행 종료하세요." 출력
 * (travel클래스에서 boolean isOilLeft로 생성
 * 
 * 무한 반복문 이용 -> 메인클래스에 생성
 * 사용자로부터 지역명 입력받기
 * 1. 서울 입력 받았으면 현재 위치 서울 출력 후 휘발유 10감소
 * 2. 부산 입력 받았으면 현재 위치 부산 출력 후 휘발유 5감소
 * 3. 화순 입력 받았으면 현재 위치 화순 출력 후 휘발유 2감소
 */