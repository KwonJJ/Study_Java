package sec01;

public class ButtonExam {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
	}

}
