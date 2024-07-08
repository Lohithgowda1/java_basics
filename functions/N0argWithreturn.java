package functions;

import java.util.Scanner;

public class N0argWithreturn {
	public static void main(String args[]) { 
		System.out.println(add());
	}
	public static int add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		return res;
	}
}
