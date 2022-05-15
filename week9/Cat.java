



public class Cat {

	private String name;
	private String breed;
	private int age;
	
	public Cat() {
		this.name = "Eli";
		this.breed = "Siberian";
		this.age = 2;
		
	}
	
	public Cat(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setAge(int age) {
		this.age =age;
	}
	
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
	public int getAge() {
		return this.age;
	}
	
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		
		
	if (obj instanceof Cat) {
		
		Cat otherCat = (Cat) obj;
		return otherCat.name.equals(this.name) && otherCat.age==this.age 
				&& otherCat. breed.equals(this.breed);
		
	}
	return false;
	
}
	public String toString() {
		 return "Cat: name = "+this.name+ ", breed = "+this.breed+", age = "+this.age;
		 
	}
	public void meow() {
		System.out.println("meowwww");
	}
}
