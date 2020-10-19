package pb_more_nasted_loops;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startNum = Integer.parseInt(scan.nextLine());
		int endNum = Integer.parseInt(scan.nextLine());
		int magicNum = Integer.parseInt(scan.nextLine());
		int count = 0;
		int sum = 0;
		scan.close();
		
		for (int i = startNum; i <= endNum; i++) {
			for (int j = startNum; j <= endNum; j++) {
				sum = i + j;
				count++;
				if (sum == magicNum) {
					System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNum);
					return;
				}
			}
		}
		
		System.out.printf("%d combinations - neither equals %d", count, magicNum);

	}

}