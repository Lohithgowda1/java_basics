package basics_java;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a == b) {
			System.out.println("Both numbers are equal");
		}else {
			System.out.println("Both numbers are not equal");
		if(a > b) {
			System.out.println(a+" is greater");
		}
		else if (a < b){
			System.out.println(a+" is smaller");
		}
      }
	}
}
