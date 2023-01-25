package lab10;
	
interface Animals {
		
	void eat();
	   
}


class Mammals {

	void sound(Object noise) {
	       
		if (noise.getClass().toString().equals("class Dog")) {
	           
			System.out.println("Dog: Bark");
	       
		}
	   
	}
	
}
	
	 
class Dog extends Mammals implements Animals {

	   
	public void eat() {
	       
		System.out.println("Dog eat meat.");
		System.out.println("Dog: Bark");
	   
	}
	
}

	
public class Client {

	   
	public static void main(String[] args) {
	       
		System.out.println("What does the mammal say?");
		System.out.println("--------------------------");
	       
		Mammals wolf = new Mammals();
		
	    wolf.sound(wolf);
	    
	    Dog dog = new Dog();
	    dog.eat();
	    dog.sound(dog);
	   
	}
	
}





