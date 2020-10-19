package nasted_loops_exercise;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int count = 1;
		scan.close();
		
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				if (count > num) {
					return;
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
