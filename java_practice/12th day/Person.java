 public class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of class Person
        Person person1 = new Person("John", 30);

        // Accessing object's attribute and method
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        person1.greet();
    }
}