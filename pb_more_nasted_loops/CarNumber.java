package pb_more_nasted_loops;

import java.util.Scanner;

public class CarNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = Integer.parseInt(scan.nextLine());
		int end = Integer.parseInt(scan.nextLine());
		
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				for (int j2 = start; j2 <= end; j2++) {
					if (((j + j2)% 2) == 0) {
						for (int k = start; k < i; k++) {
							if ((((i % 2) == 0) && ((k % 2) != 0)) || (((i % 2) != 0) && ((k % 2) == 0))) {
								System.out.printf("%d%d%d%d ", i, j, j2, k);
							}
						}
					}
				}
			}
		}
		scan.close();

	}

}
