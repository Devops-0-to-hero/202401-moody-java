package in.conceptarchitect.animals;

public class Horse extends Mammal {

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" is a herbivour";
	}
	
	public String ride() {
		return this+" "+getName()+" is an ancient ride";
	}
}
