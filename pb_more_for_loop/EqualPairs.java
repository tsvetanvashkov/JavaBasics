package pb_more_for_loop;

import java.util.Scanner;

public class EqualPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int num1 = 0;
		int num2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int no = 0;
		int diff = 0;
		int diffMax = 0;
		
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= 2; j++) {
				int num = Integer.parseInt(scan.nextLine());
				if ((j % 2) == 0) {
					num2 = num;
					sum2 = num1 + num2;
					if ((i == 1) && (sum1 != sum2) && (i != count)) {
						sum1 = sum2;
						j = 0;
						i++;
					}
				}else {
					num1 = num;
				}
			}
			if ((sum1 != sum2) && (count != 1)) {
				no = 1;
				diff = Math.abs(sum1 - sum2);
				if (diffMax < diff) {
					diffMax = diff;
				}
				sum1 = sum2;
			}else {
				sum1 = sum2;
			}

		}
		
		if (no == 1) {
			System.out.printf("No, maxdiff=%d", diffMax);
		}else {
			System.out.printf("Yes, value=%d", sum2);
		}
		scan.close();
		
	}

}
