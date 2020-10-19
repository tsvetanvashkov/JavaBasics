package conditional_statements_exercise;

import java.util.Scanner;

public class GodzillaVsKong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		int num = Integer.parseInt(scan.nextLine());
		double clothes = Double.parseDouble(scan.nextLine());
		
		budget *= (1 - 0.1);
		if (num >= 150) {
			clothes *= (1 - 0.1);
		}
		double cost = num * clothes;
		
		if (budget >= cost) {
			System.out.printf("Action!\nWingard starts filming with %.2f leva left.", (budget - cost));
		}else {
			System.out.printf("Not enough money!\nWingard needs %.2f leva more.", (cost - budget));
		}
		scan.close();

	}

}
