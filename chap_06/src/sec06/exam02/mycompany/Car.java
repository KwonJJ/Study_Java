package sec06.exam02.mycompany; // 현재 Car의 패키지 이름

import sec06.exam02.hankook.*; // 다른 패키지
import sec06.exam02.kumho.*; //다른 패키지

public class Car {
	SnowTire tire1 = new SnowTire();
	// Tire tire2 = new Tire(); -> 똑같은 이름의 클래스를 2개 import시킴 
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire(); // 경로명까지 정확히 적어줘야 에러 안남
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire(); // 경로명까지 정확히 적어줘야 에러 안남
}
