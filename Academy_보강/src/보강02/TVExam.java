package 보강02;

public class TVExam {

	public static void main(String[] args) {
		ColorTV myTv = new ColorTV(55, 100);
		IPTV iptv = new IPTV("192.168.0.250", 55, 200);
		
		myTv.printProperty();
		iptv.printProperty();
	}

}
