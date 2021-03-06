package assignment3;

//Concrete specialised sub-class Giraffe of the class Animal to deal with details of Giraffe in the Zoo
public class Giraffe extends Animal {

    //default constructor making an explicit call to the superclass constructor
    public Giraffe() {
        super();
    }

    //overloaded six-parameter constructor making explicit call to the superclass constructor
    public Giraffe(String name, int age, double height, double weight, int sectionNumber, String id) {
        super(name, age, height, weight, sectionNumber, id);
    }

    //custom-modified implementation of the AnimalBehaviour interface methods for the objects of the type Giraffe
    @Override
    public void eat() {
        System.out.println("Giraffe eating!");
    }

    @Override
    public void wakeUp() {
        System.out.println("Giraffe woken up!");
    }

    @Override
    public void move() {
        System.out.println("Giraffe trudging!");
    }

    @Override
    public void sleep() {
        System.out.println("Giraffe sleeping!");
    }

}
