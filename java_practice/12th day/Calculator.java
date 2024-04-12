// Define a class called 'Calculator'
class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();
        
        // Perform some arithmetic operations
        int resultAdd = calc.add(5, 3);
        int resultSubtract = calc.subtract(5, 3);
        int resultMultiply = calc.multiply(5, 3);
        
        
        // Display the results
        System.out.println("5 + 3 = " + resultAdd);
        System.out.println("5 - 3 = " + resultSubtract);
        System.out.println("5 * 3 = " + resultMultiply);
       
    }
}