package loppingstatements;

import java.util.Scanner;

public class Multiple5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Multiples of 5 upto 100 \n");
	
	for(int a=0; a<=100;a++) {
		if(a%5 == 0) {
			System.out.println(a);
		}
	}
}

}
