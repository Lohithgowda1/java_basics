package basics_java;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArithmeticOperators ao = new ArithmeticOperators();
		
		System.out.println("Addition:"+ao.add(a,b));
		System.out.println("Subtration:"+ao.sub(a,b));
		System.out.println("Multiplication:"+ao.mul(a,b));
		System.out.println("Division:"+ao.div(a,b));
		System.out.println("Modulus:"+ao.mod(a,b));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public int mod(int a, int b) {
		return a%b;
	}
}
