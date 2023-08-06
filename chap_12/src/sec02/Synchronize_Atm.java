package sec02;

public class Synchronize_Atm implements Runnable {
	private long depositeMoney = 10000;

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 0; i < 10; i++) { // object의 메소드
				notify(); // 쓰레드 중 하나를 깨움
				try {
					wait(); // 갖고 있던 고유 락을 해제하고 스레드를 잠들게 함
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
				if (getDepositeMoney() <= 0) {
					break;
				}
				withDraw(1000);
			}
		}
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

}
/*
 * object 클래스의 고유 메소드
 * notify(); -> 쓰레드 하나를 깨운다.
 * wait(); -> 쓰레드 락을 해제하고 잠들게 한다
 */
