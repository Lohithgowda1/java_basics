package functions;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
        ArithmeticOperation operations = new ArithmeticOperation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int sum = operations.add(a, b);
        System.out.println("Sum: " + sum);
        
        int difference = operations.subtract(a, b);
        System.out.println("Difference: " + difference);
        
        int product = operations.multiply(a, b);
        System.out.println("Product: " + product);
        
        int division= operations.divide(a, b);
        System.out.println("Division: " +division);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1,int num2) {
        return num1 - num2;
    }

    public int multiply(int num1,int num2) {
        return num1 * num2;
    }

    public int divide(int num1,int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return(0);
        }
        return num1 / num2;
    }

}
