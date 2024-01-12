package in.conceptarchitect.animals;

public class Animal {
	
	public Animal(String name) {
		System.out.println("Animal named Constructor");
		this.name=name;
	}
	
	public Animal() {
		this.name="";
		System.out.println("Animal default constructor");
	}
	
	
	public void eat() {
		System.out.println(this+" "+getName()+" eats something");
	}

	private String name="";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void move() {
		System.out.println(this+" "+getName()+" moves on somehow");
	}
	
	public void breed() {
		System.out.println(this+" "+getName()+" breeds somehow");
	}
	
	
	
}
