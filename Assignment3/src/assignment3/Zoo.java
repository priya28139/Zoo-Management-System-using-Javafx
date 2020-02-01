package assignment3;

import java.util.ArrayList;
import java.util.stream.Stream;

//class Zoo to deal with details of the animals in the zoo and provide functionality to add, delete, modify,
//print details of animals in a section and print details of the animals of the same species
public class Zoo {

    // An ArrayList of animals holding references to objects of different
    // specialised, concrete sub-classes of Animal
    public static ArrayList<Animal> animals = new ArrayList<>();

    // method to add an Animal based on user's choice
    public void addAnimal(String type, String name, int age, double height, double weight, int section, String id) {

        Animal animal = null;

        switch (type) {

            case "Bear":
                animal = new Bear(name, age, height, weight, section, id);
                break;
            case "Elephant":
                animal = new Elephant(name, age, height, weight, section, id);
                break;
            case "Giraffe":
                animal = new Giraffe(name, age, height, weight, section, id);
                break;
            case "Lion":
                animal = new Lion(name, age, height, weight, section, id);
                break;
            case "Tiger":
                animal = new Tiger(name, age, height, weight, section, id);
                break;

        }

        animals.add(animal);

    }

    //method to determine if an animal specified by its ID exists in the ArrayList, 
    //which holds references to objects of the specialised subclasses of Animal
    public boolean animalExists(String id) {

        boolean exists = false;
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                exists = true;
                break;
            }

        }

        return exists;
    }

    // method to modify an Animal based on the user's choice
    public void modifyAnimal(String id, String name, int age, double height,
            double weight, int section) {

        int index = 0;
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                break;
            }
            index++;
        }

        Animal a = animals.get(index);
        a.setName(name);
        a.setAge(age);
        a.setId(id);
        a.setHeight(height);
        a.setWeight(weight);
        a.setSectionNumber(section);

        animals.set(index, a);

    }

    // method to delete an animal based on the user's choice
    public void deleteAnimal(String id) {

        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {
                animals.remove(animal);
                return;
            }
        }
    }

    // method to display the list of animals of a particular section based on
    // user's choice, making use of lambdas and streams to filter elements which meet
    // the specific criteria(here, the match against a specific section number)
    public String printAnimalsOfASection(int sectionNumber) {

        StringBuilder result = new StringBuilder();
        Stream filteredStream = animals.stream().filter((animal) -> animal.getSectionNumber() == sectionNumber);
        Object[] a = filteredStream.toArray();
        ArrayList<Animal> selectiveAnimals = new ArrayList<>();
        for (Object obj : a) {
            if (obj instanceof Bear) {
                selectiveAnimals.add((Bear) obj);
            } else if (obj instanceof Elephant) {
                selectiveAnimals.add((Elephant) obj);
            } else if (obj instanceof Giraffe) {
                selectiveAnimals.add((Giraffe) obj);
            } else if (obj instanceof Lion) {
                selectiveAnimals.add((Lion) obj);
            } else {
                selectiveAnimals.add((Tiger) obj);
            }
        }

        if (selectiveAnimals.isEmpty()) {
            return ("No animals in section#" + sectionNumber);

        }
        for (int i = 0; i < selectiveAnimals.size(); i++) {
            result.append(String.format("Animal#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
        }

        return result.toString();
    }

    // method to display the list of animals of a particular species based on
    // user's choice, making use of lambdas and streams to filter elements which meet
    // the specific criteria(here, the match against a specific species type)
    public String printAnimalsOfSpecies(String species) {

        StringBuilder result = new StringBuilder();
        Stream filteredStream;
        Object[] a;
        ArrayList<Animal> selectiveAnimals = new ArrayList<>();

        switch (species) {
            case "Bear":
                filteredStream = animals.stream().filter((animal) -> animal instanceof Bear);
                a = filteredStream.toArray();
                for (Object obj : a) {
                    selectiveAnimals.add((Bear) obj);
                }
                if (selectiveAnimals.isEmpty()) {
                    return ("No animals of the species: " + species);

                }
                for (int i = 0; i < selectiveAnimals.size(); i++) {
                    result.append(String.format("Bear#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
                }

                break;
            case "Elephant":
                filteredStream = animals.stream().filter((animal) -> animal instanceof Elephant);
                a = filteredStream.toArray();
                for (Object obj : a) {
                    selectiveAnimals.add((Elephant) obj);
                }
                if (selectiveAnimals.isEmpty()) {
                    return ("No animals of the species: " + species);

                }
                for (int i = 0; i < selectiveAnimals.size(); i++) {
                    result.append(String.format("Elephant#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
                }
                break;

            case "Giraffe":
                filteredStream = animals.stream().filter((animal) -> animal instanceof Giraffe);
                a = filteredStream.toArray();
                for (Object obj : a) {
                    selectiveAnimals.add((Giraffe) obj);
                }
                if (selectiveAnimals.isEmpty()) {
                    return ("No animals of the species: " + species);

                }
                for (int i = 0; i < selectiveAnimals.size(); i++) {
                    result.append(String.format("Giraffe#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
                }
                break;
            case "Lion":
                filteredStream = animals.stream().filter((animal) -> animal instanceof Lion);
                a = filteredStream.toArray();
                for (Object obj : a) {
                    selectiveAnimals.add((Lion) obj);
                }
                if (selectiveAnimals.isEmpty()) {
                    return ("No animals of the species: " + species);

                }
                for (int i = 0; i < selectiveAnimals.size(); i++) {
                    result.append(String.format("Lion#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
                }
                break;
            case "Tiger":
                filteredStream = animals.stream().filter((animal) -> animal instanceof Tiger);
                a = filteredStream.toArray();
                for (Object obj : a) {
                    selectiveAnimals.add((Tiger) obj);
                }
                if (selectiveAnimals.isEmpty()) {
                    return ("No animals of the species: " + species);

                }
                for (int i = 0; i < selectiveAnimals.size(); i++) {
                    result.append(String.format("Tiger#%d:\n%s\n\n", (i + 1), selectiveAnimals.get(i)));
                }
                break;

        }

        return result.toString();
    }
}
