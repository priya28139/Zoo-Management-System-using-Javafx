package assignment3;

//Concrete specialised sub-class Elephant of the class Animal to deal with details of Elephants in the Zoo
public class Elephant extends Animal {

    // default constructor making an explicit call to the superclass constructor
    public Elephant() {
        super();
    }

    // overloaded six-parameter constructor making explicit call to the
    // superclass constructor
    public Elephant(String name, int age, double height, double weight,
            int sectionNumber, String id) {
        super(name, age, height, weight, sectionNumber, id);
    }

    // custom-modified implementation of the AnimalBehaviour interface methods
    // for the objects of the type Elephant
    @Override
    public void eat() {
        System.out.println("Elephant eating!");
    }

    @Override
    public void wakeUp() {
        System.out.println("Elephant woken up!");
    }

    @Override
    public void move() {
        System.out.println("Elephant tramping!");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeping!");
    }

}
