package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class CarToGo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double budget = Double.parseDouble(scan.nextLine());
		String season = scan.nextLine();
		double price = 0;
		String type = "";
		String carClass = "";
		
		
		if (budget <= 100) {
			carClass = "Economy class";
			if (season.equals("Summer")) {
				type = "Cabrio";
				price = budget * 0.35;
			}else if (season.equals("Winter")) {
				type = "Jeep";
				price = budget * 0.65;
			}	
		}else if ((100 < budget) && (budget <= 500)) {
			carClass = "Compact class";
			if (season.equals("Summer")) {
				type = "Cabrio";
				price = budget * 0.45;
			}else if (season.equals("Winter")) {
				type = "Jeep";
				price = budget * 0.8;
			}	
		}else if (500 < budget) {
			carClass = "Luxury class";
			price = budget * 0.9;
		}
	
		System.out.println(carClass);
		System.out.printf("%s - %.2f", type, price);
		scan.close();

	}

}
