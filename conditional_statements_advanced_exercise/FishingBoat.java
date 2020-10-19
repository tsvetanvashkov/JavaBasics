package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class FishingBoat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int budget = Integer.parseInt(scan.nextLine());
		String season = scan.nextLine();
		int num =  Integer.parseInt(scan.nextLine());
		double price = 0;
		
		if (season.equals("Spring")) {
			price += 3000;
		}else if (season.equals("Summer") || season.equals("Autumn")) {
			price += 4200;
		}else if (season.equals("Winter")) {
			price += 2600;
		}
		
		if (num <=6) {
			price *= (1 - 0.1);
		}else if ((7 < num) && (num <= 11)) {
			price *= (1 - 0.15);
		}else if (12 <= num) {
			price *= (1 - 0.25);
		}
		
		if (((num % 2) == 0) && (season.equals("Autumn") != true)) {
			price *= (1 - 0.05);
		}
		
		if (price <= budget) {
			System.out.printf("Yes! You have %.2f leva left.", (budget - price));
		}else if (budget < price) {
			System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
		}
		scan.close();

	}

}
