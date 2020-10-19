package for_loop_exercise;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double p4 = 0;
		double p5 = 0;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if (num < 200) {
				p1++;
			}else if ((200 <= num) && (num < 400)) {
				p2++;
			}else if ((400 <= num) && (num < 600)) {
				p3++;
			}else if ((600 <= num) && (num < 800)) {
				p4++;
			}else if (800 <= num) {
				p5++;
			}
		}

		System.out.printf("%.2f%%\n", ((p1 / count) * 100));
		System.out.printf("%.2f%%\n", ((p2 / count) * 100));
		System.out.printf("%.2f%%\n", ((p3 / count) * 100));
		System.out.printf("%.2f%%\n", ((p4 / count) * 100));
		System.out.printf("%.2f%%", ((p5 / count) * 100));
		scan.close();

	}

}
