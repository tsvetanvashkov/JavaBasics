package for_loop_lab;

import java.util.Scanner;

public class EvenPowersOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		for (int i = 0; i <= num; i++) {
			if ((i % 2) == 0) {
				System.out.printf("%.0f\n", Math.pow(2, i));
			}
			
		}
		scan.close();

	}

}
