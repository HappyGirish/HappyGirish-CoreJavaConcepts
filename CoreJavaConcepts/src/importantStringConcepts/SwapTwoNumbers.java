package importantStringConcepts;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = s.nextInt();
		System.out.println("Enter second number: ");
		int b = s.nextInt();
		System.out.println("Value of a and b before swapping: " + "a = " +a  + " b = " + b);
		swap(a,b);
		}
		public static void swap(int a , int b)
		{
		int swap_variable;
		swap_variable = a;
		a = b;
		b = swap_variable;
		System.out.println("Value of a and b after swapping: " + "a = " +a  + " b = " + b);
	}

}
