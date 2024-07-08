package conditionalStatement;

import java.util.Scanner;

public class Elseif {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+ " is greter than " +b);
		}
		else if(a<b){
			System.out.println(a+ " is lesser than " +b);
		}
		else {
			System.out.println(a+ " the numbers are equal " +b);
		}
	}

}
