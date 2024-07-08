package conditionalStatement;

import java.util.Scanner;

public class Nestedif {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b) {
		if(a>0) {
			System.out.println(a+" is greater and positive");
		}
	}
	else {
		System.out.println(b+" is greater");
	}
	}
}
