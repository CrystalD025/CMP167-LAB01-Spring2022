
public class Person {
	private int legNums;
	private int age;
	private double height;
	private String eyeColor;
	private String hairColor;
	private String firstName;
	private String lastName;
	
	public Person() {
		this.legNums = 2;
		this.age = 21;
		this.height = 1.78;
		this.hairColor = "brown";
		this.eyeColor = "green";
		this.firstName = "Anna";
		this.lastName = "Smith";
		
		
	}

	public Person(int legNums, int age, double height, String eyeColor, String hairColor, String firstName,
			String lastName) {
	
		this.legNums = legNums;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void speak() {
		System.out.println("Hi, my name is "+this.firstName);
	}
	
	
}
