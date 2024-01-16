package demo06.animals;

import in.conceptarchitect.animals.Animal;
import in.conceptarchitect.animals.Camel;
import in.conceptarchitect.animals.Cat;
import in.conceptarchitect.animals.Cow;
import in.conceptarchitect.animals.Crocodile;
import in.conceptarchitect.animals.Eagle;
import in.conceptarchitect.animals.Horse;
import in.conceptarchitect.animals.Leopard;
import in.conceptarchitect.animals.Parrot;
import in.conceptarchitect.animals.Snake;
import in.conceptarchitect.animals.Tiger;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testConstructorChain();
		
		
		testMultipleAnimals();
		
	}

	private static void testConstructorChain() {
		System.out.println("Animal Demo");
		
		System.out.println("Creating Tiger Reference");
		Tiger tiger;
		
		System.out.println("Creating Tiger Object");		
		tiger=new Tiger("Simba");
	}

	private static void testMultipleAnimals() {
		Animal [] animals = { 
					new Tiger("Sher Khan"), 
					new Snake(),
					new Crocodile(),
					new Cow(),
					new Eagle(),
					new Animal(),
					new Horse(),
					new Camel(),
					new Parrot(),
					new Leopard(),
					new Cat(),
				};
		
		for(Animal animal : animals)
			testAnimal(animal);
		
		
		
	}
	
	static void testAnimal(Animal animal) {
		System.out.println("Animal Name is "+animal.getName());
		System.out.println(animal.eat());
		System.out.println(animal.move());
		System.out.println(animal.breed());
		System.out.println();
	}

	private static void testSubClassMethodAccess() {
		Tiger tiger = new Tiger("Simba");
		tiger.setName("Simba");
		tiger.hunt();
		
		Animal a= tiger;  //works. tiger is animal
		//a.hunt();  //ERROR: animal doesn't know how to hunt
	}
	
	

	private static void test1() {
		Animal animal1 = new Animal();
		animal1.setName("Chiku");
		testAnimal(animal1);
		
		Animal animal2= new Tiger("Simba");
		animal2.setName("Simba");
		testAnimal(animal2);
	}
	
	

}
