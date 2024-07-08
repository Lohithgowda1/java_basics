package basics_java;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
		int a=sc.nextInt();
		String result=(a%2==0)?(result="Even"):(result="Odd");;
		System.out.println(result);
	}
}
