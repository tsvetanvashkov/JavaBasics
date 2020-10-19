package pb_more_nasted_loops;

import java.util.Scanner;

public class PrimePairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startFirst = Integer.parseInt(scan.nextLine());
		int startSecond = Integer.parseInt(scan.nextLine());
		int difFirst = Integer.parseInt(scan.nextLine());
		int difSecond = Integer.parseInt(scan.nextLine());
		int endFirst = startFirst + difFirst;
		int endSecond = startSecond + difSecond;
		
		
		
		for (int i = startFirst; i <= endFirst; i++) {
			boolean firstPrime = true;
			for (int j = 2; j <= (i / 2); j++) {
				if ((i % j) == 0) {
					firstPrime = false;
					break;
				}
			}
			if (firstPrime) {
				for (int j2 = startSecond; j2 <= endSecond; j2++) {
					boolean secondPrime = true;
					for (int k = 2; k <= (j2 / 2); k++) {
						if ((j2 % k) == 0) {
							secondPrime = false;
							break;
						}
					}
					if (secondPrime) {
						System.out.printf("%d%d\n", i, j2);
					}
				}
			}
		}
		scan.close();

	}

}
