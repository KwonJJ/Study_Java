package sec01_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExam01 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test8.txt");
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
