package assignment3;

//Concrete specialised sub-class Lion of the class Animal to deal with details of Lions in the Zoo
public class Lion extends Animal {

    // default constructor making an explicit call to the superclass constructor
    public Lion() {
        super();
    }

    // overloaded six-parameter constructor making explicit call to the
    // superclass constructor
    public Lion(String name, int age, double height, double weight,
            int sectionNumber, String id) {
        super(name, age, height, weight, sectionNumber, id);
    }

    // custom-modified implementation of the AnimalBehaviour interface methods
    // for the objects of the type Lion
    @Override
    public void eat() {
        System.out.println("Lion eating!");
    }

    @Override
    public void wakeUp() {
        System.out.println("Lion woken up!");
    }

    @Override
    public void move() {
        System.out.println("Lion racing!");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeping!");
    }

}
