package in.conceptarchitect.animals;

public class Bird extends Animal {

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return fly();
	}

	@Override
	public String breed() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" lays egss";
	}
	
	public String fly() {
		return this+" "+getName()+" fly in sky";
	}

	
}
