package basicjavaprogramm;

import java.util.Scanner;

public class Sumof3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=add(a,b,c);
		System.out.println("The sum of three numbers is "+res);
		
	}
	public static int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}

}
