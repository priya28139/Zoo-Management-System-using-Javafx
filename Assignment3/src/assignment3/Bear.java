package assignment3;

//Concrete specialised sub-class Bear of the class Animal to deal with details of Bears in the Zoo
public class Bear extends Animal {

	// default constructor making an explicit call to the superclass constructor
	public Bear() {
		super();
	}

	// overloaded six-parameter constructor making explicit call to the
	// superclass constructor
	public Bear(String name, int age, double height, double weight,
			 int sectionNumber, String id) {
		super(name, age, height, weight, sectionNumber, id);
	}

	// custom-modified implementation of the AnimalBehaviour interface methods
	// for the objects of the type Bear
	@Override
	public void eat() {
		System.out.println("Bear eating!");
	}

	@Override
	public void wakeUp() {
		System.out.println("Bear woken up!");
	}

	@Override
	public void move() {
		System.out.println("Bear bouncing!");
	}

	@Override
	public void sleep() {
		System.out.println("Bear sleeping!");
	}

}
