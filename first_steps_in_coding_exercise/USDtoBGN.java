package first_steps_in_coding_exercise;

import java.util.Scanner;

public class USDtoBGN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double usd = scan.nextDouble();
		double bgn = usd * 1.79549;
		System.out.println(bgn);
		scan.close();

	}

}
