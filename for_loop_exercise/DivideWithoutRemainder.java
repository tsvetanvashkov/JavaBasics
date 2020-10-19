package for_loop_exercise;

import java.util.Scanner;

public class DivideWithoutRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if ((num % 2) == 0) {
				p1++;
			}
			if ((num % 3) == 0) {
				p2++;
			}
			if ((num % 4) == 0) {
				p3++;
			}
		}

		System.out.printf("%.2f%%\n", ((p1 / count) * 100));
		System.out.printf("%.2f%%\n", ((p2 / count) * 100));
		System.out.printf("%.2f%%\n", ((p3 / count) * 100));

		scan.close();


	}

}
