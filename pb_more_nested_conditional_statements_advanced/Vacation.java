package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double budget = Double.parseDouble(scan.nextLine());
		String season = scan.nextLine();
		double price = 0;
		String location = "";
		String place = "";
		
		if (budget <= 1000) {
			place = "Camp";
			if (season.equals("Summer")) {
				location = "Alaska";
				price = budget * 0.65;
			}else if (season.equals("Winter")) {
				location = "Morocco";
				price = budget * 0.45;
			}	
		}else if ((1000 < budget) && (budget <= 3000)) {
			place = "Hut";
			if (season.equals("Summer")) {
				location = "Alaska";
				price = budget * 0.8;
			}else if (season.equals("Winter")) {
				location = "Morocco";
				price = budget * 0.6;
			}	
		}else if (3000 < budget) {
			place = "Hotel";
			price = budget * 0.9;
			if (season.equals("Summer")) {
				location = "Alaska";
			}else if (season.equals("Winter")) {
				location = "Morocco";
			}	
		}
		
		System.out.printf("%s - %s - %.2f", location, place, price);
		scan.close();

	}

}
