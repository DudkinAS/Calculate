// Alia Dudkin
// COSC 1430 -501
// Project #1
// Due date: 2/12/2018

import java.util.Scanner;


public class Calculate {

	public static void main(String[] args) {

		int n1, n2, sum, product, difference, quotient;
		Scanner keyboard = new Scanner (System.in);

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt();
		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();


		sum = n1 + n2;
		product = n1 * n2;
		difference = n1 - n2;
		quotient = n1 / n2;


		System.out.println("\nOutput:");
		System.out.println("\tSum: \t\tNum1 + Num2 = " + n1 + " + " + n2 + " = " + sum);
		System.out.println("\tProduct: \tNum1 * Num2 = " + n1 + " * " + n2 + " = " + product);
		System.out.println("\tDifference: \tNum1 - Num2 = " + n1 + " - " + n2 + " = " + difference);
		System.out.println("\tQuotient: \tNum1 / Num2 = " + n1 + " / " + n2 + " = " + quotient);
	}
}
