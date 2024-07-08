package conditionalStatement;

import java.util.Scanner;

public class PositiveOrNegative {public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	if(a<0) {
		System.out.println("It is a negative number");
	}
	else if(a==0){
		System.out.println("It is a neutral number");
		}
	else {
		System.out.println("It is positive number");
	}
	}
}
