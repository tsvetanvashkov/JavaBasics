package pb_more_nasted_loops;

import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int oneLev = Integer.parseInt(scan.nextLine());
		int twoLeva = Integer.parseInt(scan.nextLine());
		int fiveLeva = Integer.parseInt(scan.nextLine());
		int sum = Integer.parseInt(scan.nextLine());
		int count = 0;
		
		for (int i = 0; i <= oneLev; i++) {
			for (int j = 0; j <= twoLeva; j++) {
				for (int j2 = 0; j2 <= fiveLeva; j2++) {
					count = i + (j * 2) + (j2 * 5);
					if (count == sum) {
						System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, j2, sum);
					}
					count = 0;
				}
			}
		}
		scan.close();

	}

}
