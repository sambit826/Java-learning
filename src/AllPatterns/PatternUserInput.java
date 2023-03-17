package AllPatterns;

import java.util.Scanner;

public abstract class PatternUserInput implements Pattern {
	
	public int takeUserInput() {
		System.out.println("Enter Maximum -- rows to print");
		Scanner scn  =  new Scanner(System.in);
		int val = scn.nextInt();
		return val;
	}

}
