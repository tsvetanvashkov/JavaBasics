package for_loop_lab;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int smallest = Integer.MAX_VALUE;
		int biggest = Integer.MIN_VALUE;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if (num > biggest) {
				biggest = num;
			}
			if (num < smallest) {
				smallest = num;
			}
			
		}
		
		System.out.printf("Max number: %d\n", biggest);
		System.out.printf("Min number: %d", smallest);
		scan.close();

	}

}
