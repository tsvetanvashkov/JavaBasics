package pb_more_drawing_figures_with_loops;

import java.util.Scanner;

public class RhombusOfStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 2; j <= i; j++) { 
				System.out.print("* ");
			}
			System.out.println("*");
		}
		for (int i = 1; i <=(n - 1); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < (n - 1); j++) {   
				System.out.print("* ");					
			}											
			System.out.println("*");
		}
		scan.close();

	}

}
