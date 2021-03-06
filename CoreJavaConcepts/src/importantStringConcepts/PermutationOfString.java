package importantStringConcepts;

import java.util.Scanner;

public class PermutationOfString {
	
	public static void permutAnyString(String candidate, String remaining) {
		
		if(remaining.length()== 0) {
			System.out.println(candidate);
		}
		
		for (int i=0;i< remaining.length();i++) {
			String newCandidate = candidate+remaining.charAt(i);
			String newRemaining = remaining.substring(0, i)+remaining.substring(i+1);
			permutAnyString(newCandidate,newRemaining);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the String to be Permutated");
		Scanner scan = new Scanner(System.in);
		String remaining=scan.nextLine();
		
		//String st ="ABC";
		permutAnyString("", remaining);
	}

}
