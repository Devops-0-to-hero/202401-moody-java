package in.conceptarchitect.animals;

public class Eagle extends Bird {

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" "+getName()+" is a flesh eater";
	}
	
	public String hunt() {
		return this+" "+getName()+" is a flying hunter";
	}

	
	
}
