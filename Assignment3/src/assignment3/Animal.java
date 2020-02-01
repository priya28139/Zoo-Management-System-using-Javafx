package assignment3;

//Abstract Animal class to specify common functionality and attributes for the concrete subclasses
//but to prevent the program from creating objects of the Animal class.
//The class implements the interface AnimalBehaviour(without actually providing implementation for the 
//interface methods, which are then actually implemented by the concrete sub-classes)
public abstract class Animal implements AnimalBehaviour {

    // private instance variables
    private String name;
    private int age;
    private double height;
    private double weight;
    private int sectionNumber;
    private String id;

    // default constructor
    public Animal() {
        this("", 0, 0.0, 0.0, 0, "");
    }

    // overloaded six-parameter constructor with exception handling to ensure
    // appropriate initialisation
    // of the instance variables
    public Animal(String name, int age, double height, double weight,
            int sectionNumber, String id) {
        this.name = name;

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;

        if (height < 0.0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;

        if (weight < 0.0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        this.weight = weight;

        if (sectionNumber < 0 || sectionNumber > 5) {
            throw new IllegalArgumentException(
                    "Section number cannot be less than or equal to 0, or greater than 5.");
        }
        this.sectionNumber = sectionNumber;
        this.id = id;

    }

    // getters and setters for the instance variables
    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        if (sectionNumber < 0 || sectionNumber > 5) {
            throw new IllegalArgumentException(
                    "Section number cannot be less than or equal to 0, or greater than 5.");
        }
        this.sectionNumber = sectionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0.0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Overridden version of the toString() method to provide an appropriate
    // String representation of an object
    // of the Animal class
    @Override
    public String toString() {
        return String
                .format("Animal:%s\nName:%s\nID:%s\nAge:%d\nHeight:%.2f\nWeight:%.2f\nSection-Number:%d",
                        this.getClass().getSimpleName(), this.getName(),
                        this.getId(), this.getAge(),
                        this.getHeight(), this.getWeight(),
                        this.getSectionNumber());
    }

}
