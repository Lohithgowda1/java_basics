package basicjavaprogramm;

import java.util.Scanner;

public class Areaofcirclr {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the radious of circle");
		int r=sc.nextInt();
		int square=r*r;
		double area;
		if(r>0) {
			area=3.14*square;
			System.out.println(area+" is a area of circle");
			
		}
	}

}
