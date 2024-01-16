package in.conceptarchitect.animals;

public class Cat extends Mammal {
	
	

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" is a flesh eater";
	}
	
	public String hunt() {
		return this+" "+getName()+" is a hunter";
	}
}
