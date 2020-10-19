package pb_more_nasted_loops;

import java.util.Scanner;

public class LuckyNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((num % (i + j)) == 0) {
					for (int j2 = 1; j2 <= 9; j2++) {
						for (int k = 1; k <= 9; k++) {
							if ((i + j) == (j2 + k)) {
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
