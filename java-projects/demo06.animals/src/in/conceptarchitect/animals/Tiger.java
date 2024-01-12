package in.conceptarchitect.animals;

public class Tiger extends Animal{
	
		public Tiger(String name) {
			super(name);
			System.out.println("Tiger constructor called");
		}
	
		public void eat() {
			hunt(); //first hunt
			super.eat(); //then eat using old method
		}

		public void hunt() {
			System.out.println(this+" "+getName()+" hunts");
		}
}
