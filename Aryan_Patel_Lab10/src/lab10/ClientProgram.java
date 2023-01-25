package lab10;

class Animal{
	
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void Organ() {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
        
	       return name;
	    
	}
	    
	public int getAge() {
	        
		return age;
	    
	}
	    
	public void setName(String newName) {
	        
		name = newName;
	    
	}
	    
	public void setAge(int newAge) {
	        
		age = newAge;
	    
	}
	
	public void organ() {
		
		System.out.println("This animal has organs.");
		
	}
	
	@Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
	
}

class Fish extends Animal{
	
	private String organ;
	private int eyes;
	
	public Fish(String name, int age) {
        
    	super(name,age);
    	this.organ = "Gills";
    	this.eyes = 2;
        
    }
	
	public void Show() {
		
		System.out.print("Fish: Name = " + name + ", Age = " + age + ",");
		
	}
	
	@Override
    
	public void Organ() {
		
        System.out.print(" Organs = " + organ + " and " + eyes + " eyes.");
        
    }
	
}

class Mammal extends Animal{
	
	private int eyes;

    public Mammal(String name, int age) {
        super(name, age);
        this.eyes = 2;
    }

    public int getEyes() {
        return this.eyes;
    }
    
    public void Show() {
		
		System.out.print("\nMammal: Name = " + name + ", Age = " + age + ",");
		
	}

    @Override
    public void Organ() {
    	
    	System.out.print(" Organs = " + eyes + " eyes.");
        
    }
	
}

class Bird extends Animal{
	
	 private String organ;
	 private int eyes;

	    public Bird(String name, int age) {
	        super(name, age);
	        this.organ = "Wings";
	        this.eyes = 2;
	    }

	    public String getExtra() {
	        return this.organ;
	    }
	    
	    public void Show() {
	    	
	    	System.out.print("\nBird: Name = " + name + ", Age = " + age + ",");
	    	
	    }

	    @Override
	    public void Organ() {
	    	
	    	 System.out.print(" Organs = " + organ + " and " + eyes + " eyes.");
	    	 
	    }
	
}

public class ClientProgram {

	public static void main(String[] args) {
		
		Fish nemo = new Fish("Nemo", 5);
		
		nemo.Show();
		nemo.Organ();
		
		Mammal wolf = new Mammal("Edgar", 27);
		
		wolf.Show();
		wolf.Organ();
		
		Bird robin = new Bird("Robin", 13);
		
		robin.Show();
		robin.Organ();
		
		
	}

}


