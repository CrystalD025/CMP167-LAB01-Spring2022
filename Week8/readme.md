#Classes/Type/ADT: a written description of the attributes(instance variables) and behaviors(instance methods) of an object 
##blueprint
#object: An instance of a class
##a physical representation of the blueprint
##there can be multiple objects created for the same class
##syntax
	acessModifier class NameOfClass {
	
	}
	
#Behaviors: Constructor, setters and getters, equals, toStirng, comapreTo, customMethods
#Constructors: Special method that shares the same name as the class, does not have a return type, and the task of the constructor is to initialize the instance variable and instantiate the objects  

#Setters: mutators, it modifies the values of the instance variables 

#Getters:accessors, they retrieve the value of the instance variables 

#Four pillars of OOPL: polymorphism, encapsulation, abstraction, inheritance   		
-polymorphism- multiple forms 
-encapsulation: limiting the acess to data by encapsulating and controlling access through setters and getters 
-

	public class Mammal{
		private int numOfLegs;
		private boolean hasFur;
		private String species;
		
		public Mammal () {
			this.numOfLegs=2;   //initialize the instance variable
			this.hasFur = true; 
			this.species= "bear";
			}
		}

		public Mammal (int numOfLegs,boolean hasFur, String species ) {
			this.numOfLegs = numOfLegs; 
			this.hasFur = hasFur; 
			this.species= species; 
			}
			
		public void setnumOfLegs (int numOfLegs) {	//create setter
			this.numOfLegs = numOfLegs;
		
		}
		
		public int getnumOfLegs () {  	//create getter
			return this.numOfLegs;
		}
		//to run add main method 
		
		public static 
	
		}
	
	
	
	
	