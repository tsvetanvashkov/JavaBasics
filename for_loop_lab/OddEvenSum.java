package for_loop_lab;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if ((i % 2) == 0) {
				evenSum += num;
			}else {
				oddSum += num;
			}
		}
		
		if (evenSum == oddSum) {
			System.out.printf("Yes\nSum = %d", evenSum);
		} else {
			System.out.printf("No\nDiff = %d", Math.abs(evenSum - oddSum));
		}
		scan.close();

	}

}
