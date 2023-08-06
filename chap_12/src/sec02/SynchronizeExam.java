package sec02;

public class SynchronizeExam {

	public static void main(String[] args) {
		Synchronize_Atm atm = new Synchronize_Atm();
		Thread mother = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		mother.start();
		son.start();
	}

}
