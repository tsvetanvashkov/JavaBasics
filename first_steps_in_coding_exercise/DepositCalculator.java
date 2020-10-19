package first_steps_in_coding_exercise;

import java.util.Scanner;

public class DepositCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double depositSum = Double.parseDouble(scan.nextLine());
		int months = Integer.parseInt(scan.nextLine());
		double yearPercent = Double.parseDouble(scan.nextLine());
		double sum = depositSum + (months *((depositSum*(yearPercent/100))/12));
		System.out.printf("%.2f",sum);
		scan.close();

	}

}
