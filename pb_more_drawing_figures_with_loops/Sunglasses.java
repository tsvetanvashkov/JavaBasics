package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class Sunglasses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= n; i++) {
			if ((i == 1) || (i == n)) {
				for (int j = 1; j <= (n * 2); j++) {
				System.out.print("*");
				}
				for (int j = 1; j <= n; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (n * 2); j++) {
					System.out.print("*");
				}
				System.out.println();
				
			} else {
				System.out.print("*");
				for (int j = 1; j <= ((n * 2) - 2); j++) {
					System.out.print("/");
				}
				System.out.print("*");
				if (i == ((n - 1)/2 + 1)) {
					for (int j = 1; j <= n; j++) {
						System.out.print("|");
					}
				} else {
					for (int j = 1; j <= n; j++) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
				for (int j = 1; j <= ((n * 2) - 2); j++) {
					System.out.print("/");
				}
				System.out.print("*");
				System.out.println();
			}
			
		}
		scan.close();

	}

}
