package nested_loops_lab;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = Integer.parseInt(scan.nextLine());
		int end = Integer.parseInt(scan.nextLine());
		int number = Integer.parseInt(scan.nextLine());
		int count = 0;
		
		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				count++;
				if ((i + j) == number) {
					System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, number);
					scan.close();
					return;
				}
			}
		}

			System.out.printf("%d combinations - neither equals %d", count, number);
		scan.close();

	}

}
