package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class ChrismasTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= (n + 1); i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print(" | ");
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}

