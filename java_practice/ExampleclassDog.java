class ExampleClassDog {
    // Attributes
    String name;
    String breed;
    int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Method to print dog's information
    public void print main() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of class Dog
        Dog myDog = new Dog("Buddy", "Labrador", 5);

        
        myDog.printInfo(); 
        myDog.bark();      
    }
}