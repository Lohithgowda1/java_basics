package conditionalStatement;

import java.util.Scanner;
	public class Ifelse2 {
		public static void main(String args[]) {
			System.out.println("enter the age of the person");
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			if(age>=18) {
				System.out.println("The person is eligible to vote");
			}
			else {
				System.out.println("The person is not eligible to vote");
			}
	}
}
