package hw_day11_DSA_SquareRoot;

import java.util.Scanner;

public class SquareRootMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
		
        double result = SquareRoot.sqrt(num);
        System.out.println("Square root of " + num + " is " + result);

	}

}
