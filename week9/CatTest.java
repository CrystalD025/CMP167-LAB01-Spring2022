
public class CatTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Bagel", "Tabby", 5);
		Cat cat3 = new Cat();
		
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		System.out.println(cat1.equals(cat3)); //expected value: true 
		System.out.println(cat2.equals(cat1)); //expected value: false
		cat3.setName("Marco");
		System.out.println(cat1.equals(cat3)); //expected value: false
		
		cat3.meow(); 
	}
}


