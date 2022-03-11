/**
 * 
 * a program that calculates all the powers of 2 from numbers 1-10
 *
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		
		
		int base = 0;
		int pow = 2;
	
	
		
		for (int i =1; i<=10; i++) {
			
			base  = base + 1;
			System.out.println( base + " to the power of 2 is: " + (Math.pow(base, pow)));
		}
	
		
			
		
		
	}
		

}
