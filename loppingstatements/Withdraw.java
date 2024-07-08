package loppingstatements;

import java.util.Scanner;

public class Withdraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance amount ");
		int bal = sc.nextInt();
		
		while(bal >= 2000) {
			bal -= 2000;
			System.out.println("2000 withdrawn, balance is "+bal+"rs");
		}
		System.out.println("Balance insufficient to withdraw - "+bal+"rs");
	}
}
