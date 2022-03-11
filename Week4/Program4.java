
/**
 * 
 * @author crystaldiaz
 *write a program that prompts the users age and determine whether the user can drink alcohol or not
 */
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		int age;
		
		System.out.println("Hello, Welcome!");
		System.out.println("How old are you?");
		
		age = scnr.nextInt();
		
		if (age>=21) {
			System.out.println("You are legally allowed to drink alcohol");
		}
		else if (age<21) {
			System.out.println("You cannot legally consume alcohol.");
		}
		
		
		
		scnr.close();
		
		
		//String name =scnr.next(); 
		
		
		
	}
}
