package pb_more_nasted_loops;

import java.util.Scanner;

public class HappyCatParking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int hours = Integer.parseInt(scan.nextLine());
		double sum = 0;
		double total = 0;
		
		for (int i = 1; i <= days; i++) {
			for (int j = 1; j <= hours; j++) {
				if (((i % 2) == 0) && ((j % 2) != 0)) {
					sum += 2.5;
				}else if (((i % 2) != 0) && ((j % 2) == 0)) {
					sum += 1.25;
				}else {
					sum++;
				}
			}
			total += sum;
			System.out.printf("Day: %d - %.2f leva\n", i, sum);
			sum = 0;
		}
		System.out.printf("Total: %.2f leva", total);
		scan.close();

	}

}
