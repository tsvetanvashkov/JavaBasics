package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class SquareFrame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i < n; i++) {
			if ((i == 0) || (i == (n - 1))) {
				System.out.print("+ ");
			}else {
				System.out.print("| ");
			}
			for (int j = 0; j < (n - 2); j++) {
				System.out.print("- ");
			}
			if ((i == 0) || (i == (n - 1))) {
				System.out.println("+");
			}else {
				System.out.println("|");
			}
		}
		scan.close();

	}

}
