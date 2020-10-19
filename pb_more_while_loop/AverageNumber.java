package pb_more_while_loop;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		double sum = 0;
		
		for (int i = 0; i < number; i++) {
			int num = Integer.parseInt(scan.nextLine());
			sum = sum + num;
		}
		System.out.printf("%.2f", (sum / number));
		scan.close();

	}

}
