package functions;

import java.util.Scanner;

public class WithargNoreturn {
	public static void main(String args[]) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add (a,b);
	}
	public static void add(int num1,int num2) {
		int res=num1+num2;
		System.out.println(res);
	}
}
