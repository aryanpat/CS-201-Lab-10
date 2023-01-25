package lab10;


interface A {
	   
	void printA();

	private void print5(String str) {
	       
		for(int i = 0; i < 5; i++) {
			   
			System.out.print(str);
	           
	      }

	   }

	   default void printB() {
		   
	       this.print5("B");
	       
	   }

	   default void printC() {
		   
		   System.out.println(" ");
	       this.print5("C");
	       
	   }
	   
	}

class B implements A {

	   public void printA() {
		   
	       System.out.println("A");
	       
	   }
	}

public class Test{

	public static void main(String[] args) {
		   
		B b = new B();
	       
	    b.printA();
	    b.printB();
	    b.printC();
	       
	   }
}

