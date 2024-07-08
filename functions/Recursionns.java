package functions;

import java.util.Scanner;

public class Recursionns {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=add(a,b);
		System.out.println("Result "+result);
	}
	public static int add(int num1,int num2) {
		return num1+num2;
	}
}
