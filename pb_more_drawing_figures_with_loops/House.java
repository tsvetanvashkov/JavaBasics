package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= ((n + 1)/2); i++) {
			if ((n % 2) == 0) {
				for (int j = i; j < (n + 1)/2; j++) {
					System.out.print("-");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.print("**");
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				for (int j = i; j < (n + 1)/2; j++) {
					System.out.print("-");
				}
				System.out.println();
			} else {
				for (int j = i; j < (n + 1)/2; j++) {
					System.out.print("-");
				}
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.print("*");
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				for (int j = i; j < (n + 1)/2; j++) {
					System.out.print("-");
				}
				System.out.println();
			}
				
		}
		for (int i = 1; i <= (n / 2); i++) {
			System.out.print("|");
			for (int j = 1; j <= (n - 2); j++) {
				System.out.print("*");
			}
			System.out.println("|");
		}
		scan.close();

	}

}
