package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		String season = scan.nextLine();
		String destination = "";
		String place = "";
		double price = 0;
		
		
		if (budget <= 100) {
			destination = "Bulgaria";
			if (season.equals("summer")) {
				place = "Camp";
				price = budget * 0.3;
			}else if (season.equals("winter")) {
				place = "Hotel";
				price = budget * 0.7;
			}
		}else if ((100 < budget) && (budget <= 1000)) {
			destination = "Balkans";
			if (season.equals("summer")) {
				place = "Camp";
				price = budget * 0.4;
			}else if (season.equals("winter")) {
				place = "Hotel";
				price = budget * 0.8;
			}
		}else if (1000 < budget) {
			destination = "Europe";
			place = "Hotel";
			price = budget * 0.9;
		}
		
		System.out.println("Somewhere in " + destination);
		System.out.printf("%s - %.2f", place, price);
		scan.close();
		

	}

}
