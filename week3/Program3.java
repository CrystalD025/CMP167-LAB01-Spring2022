/**
 * 
 * @author crystaldiaz
 *
 */
import java.io.StringWriter;
import java.io.PrintWriter;

public class Program3 {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.println("I like cats");
		pw.println("I have a cat named");
		pw.printf("Today I made $ %3d !%n ", 4000000);
		
		String message = sw.toString();
		System.out.println(message);
		
	}

}
