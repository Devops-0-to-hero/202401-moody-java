package in.conceptarchitect.animals;

public class Animal {
	
	public Animal(String name) {
		//System.out.println("LOG:Animal named Constructor");
		this.name=name;
	}
	
	
	
	public Animal() {
		this.name="";
		//System.out.println("LOG:Animal default constructor");
	}
	
	
	public String eat() {
		return(this+" "+getName()+" eats something");
	}

	private String name="";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public String move() {
		return(this+" "+getName()+" moves on somehow");
	}
	
	public String breed() {
		return(this+" "+getName()+" breeds somehow");
	}
	
	
	
}
