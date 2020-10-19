package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class SequareOfStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1); j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
		scan.close();

	}

}
