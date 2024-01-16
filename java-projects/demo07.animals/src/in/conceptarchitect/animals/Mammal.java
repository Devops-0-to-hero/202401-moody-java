package in.conceptarchitect.animals;

public class Mammal extends Animal {
	
	@Override
	public String breed()
	{
		return this+" "+getName()+" is child bearing";
	}
	


	
	
	Mammal() {
		//super()
	}
	
	public Mammal(String name) {
		super(name);
	}
	

	
	
}
