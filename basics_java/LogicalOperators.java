package basics_java;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if((a%2==0) && (b%2==0)) {
			System.out.println("Both numbers are even");
		}else if((a%2==0) || (b%2==0)) {
			System.out.println("Either "+a+" or "+b+" is even");
		}
	}
}
