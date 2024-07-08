package basics_java;

import java.util.Scanner;

public class UnaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = 100;
        
        int postin = a++;
        int prein = ++a;
        int prede = --a;
        int postde = a--;
        System.out.println("Post increment value: "+postin);
        System.out.println("Pre increment value: "+prein);
        System.out.println("Pre decrement value: "+prede);
        System.out.println("Post decrement value: "+postde);
     	}
}
