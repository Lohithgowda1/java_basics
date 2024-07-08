package conditionalStatement;

import java.util.Scanner;

public class Simpleif {
	public static void main(String args[]) {
		System.out.println("Enter the  number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=10) {
			System.out.println("the number is greater than or equal to 10");
		}
	}
}
