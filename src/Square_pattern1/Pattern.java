package Square_pattern1;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice ;
		while (true) {
			System.out.println(" ");
			System.out.println("INPUT A NUMBER TO CREATE A SQUARE PATTERN");
			int l = sc.nextInt();
			int i, j;
			for (i = 1; i <= l; i++) {
				for (j = 1; j <= l; j++) {
					System.out.print("*");
				}
				System.out.println(" ");

			}

			while (true) {
				System.out.println("DO YOU WANT TO CONTINUE : (Y|N)");
				choice = sc.next().charAt(0);
				if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n') {

					break;
				} else {
					System.out.println("Invalid Input");
					continue;
				}
			}
			if (choice == 'N' || choice == 'n') {
				break;
			}

		}

	}

}
