package conditionalStatement;

import java.util.Scanner;

public class Calcultor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice\n 1 add\n 2 sub \n 3 div\n 4 mul\n");
		int ch=sc.nextInt();
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(a+b);
			break ;
		case 2:
			System.out.println(a-b);
			break ;
		case 3:
			System.out.println(a/b);
			break ;
		case 4:
			System.out.println(a*b);
			break ;
		default:
			System.out.println("enter the valid choice");
		}
	}

}
