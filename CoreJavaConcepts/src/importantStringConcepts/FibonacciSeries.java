package importantStringConcepts;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the number upto which Fibonacci series should be printed ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Fibonacci Series upto %d is " + num);
		for(int i=1; i<=num; i++)
		{
		System.out.print(fib(i) + " ");
		}
		}
		public static int fib(int n)
		{
		if(n ==1 || n==2)
		{
		return 1;
		}
		return fib(n-1) + fib(n-2);
		}

}
