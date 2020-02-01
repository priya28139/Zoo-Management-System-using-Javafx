package assignment3;

//Concrete specialised sub-class Tiger of the class Animal to deal with details of Tigers in the Zoo
public class Tiger extends Animal {
    // default constructor making an explicit call to the superclass constructor

    public Tiger() {
        super();
    }

    // overloaded six-parameter constructor making explicit call to the
    // superclass constructor
    public Tiger(String name, int age, double height, double weight,
            int sectionNumber, String id) {
        super(name, age, height, weight, sectionNumber, id);
    }

    // custom-modified implementation of the AnimalBehaviour interface methods
    // for the objects of the type Tiger
    @Override
    public void eat() {
        System.out.println("Tiger eating!");
    }

    @Override
    public void wakeUp() {
        System.out.println("Tiger woken up!");
    }

    @Override
    public void move() {
        System.out.println("Tiger stalking!");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeping!");
    }

}
