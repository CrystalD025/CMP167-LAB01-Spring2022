
/**
 * 
 * @author crystaldiaz
 * lab week 8
 *
 */



public class Mammal {
	//attributes
		private int numOfLegs;
		private boolean hasFur;
		private String species;
		
		//default constructor
		public Mammal () {
			this.numOfLegs=2;   //initialize the instance variable
			this.hasFur = true; 
			this.species= "bear"; 
			}
		
		//overloaded constructor
		public Mammal (int numOfLegs,boolean hasFur, String species ) {
			this.numOfLegs = numOfLegs; 
			this.hasFur = hasFur; 
			this.species= species; 
			}
			//setter
		public void setnumOfLegs (int numOfLegs) {	
			this.numOfLegs = numOfLegs;
		
		}
		//getter
		public int getnumOfLegs () {  
			return this.numOfLegs;
			
		}
		public boolean gethasFur () {
			return this.hasFur;
		}
		public String getspecies () {
		return this.species;
		}
		public static void main(String[]args) {
			
			Mammal mammal1= new Mammal();
			System.out.println(mammal1.hasFur);
			System.out.println(mammal1.species);
			
			Mammal mammal2= new Mammal(4, false, "Cat");
			
		
		}
		
		}

