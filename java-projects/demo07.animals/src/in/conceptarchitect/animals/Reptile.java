package in.conceptarchitect.animals;

public class Reptile extends Animal {


	@Override
	public String breed() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" lays eggs";
	}
	
	public String hunt() {
		return this+" "+getName()+" hunts";
	}
	
	public Reptile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" are flesheater";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" crawls";
	}

	
	
	
	
	

}
