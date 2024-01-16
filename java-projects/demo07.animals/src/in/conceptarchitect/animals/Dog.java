package in.conceptarchitect.animals;

public class Dog extends Mammal {
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" is a flesh eater";
	}
	
	public String hunt() {
		return this+" "+getName()+" is a hunter";
	}

}
