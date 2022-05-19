
public class program6 {

	
	
	public static int product(int x, int y) //method definition, concrete method bc has a body defined 
	{
	
	return x*y;
	}

	public static int sumAll(int n, int m)
	{
	int sum = 0;
	for (int i=n; i<=m; i++) {
			sum +=n;
			
		}
		return sum;
	}
	
	public static void main(String [] args){
		//System.out.println("First argument: "+args[0]); 
		
		greet();
		int total = sumAll(10,20);
		System.out.println("Total: "+total);
		
		int product = product(5,3);
		System.out.println("Product: "+product);
	}
	
	private static void greet() {
		System.out.println("hello");
	}
}
