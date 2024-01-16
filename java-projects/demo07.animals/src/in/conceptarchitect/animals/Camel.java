package in.conceptarchitect.animals;

public class Camel extends Mammal {

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" is a herbivour";
	}
	
	public String ride() {
		return this+" "+getName()+" is a desert ride";
	}
	
	
	
}
