package for_loop_lab;

import java.util.Scanner;

public class LeftandRightSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int leftSum = 0;
		int rightSum = 0;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			leftSum += num;
		}
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			rightSum += num;
		}
		
		if (leftSum == rightSum) {
			System.out.printf("Yes, sum = %d", leftSum);
		} else {
			System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
		}
		scan.close();

	}

}
