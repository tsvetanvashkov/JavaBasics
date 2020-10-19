package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class TruckDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String season = scan.nextLine();
		Double km = Double.parseDouble(scan.nextLine());
		double price = 0;


		if (km <= 5000) {
			if (season.equals("Spring") || season.equals("Autumn")) {
				price = km * 0.75;
			}else if (season.equals("Summer")) {
				price = km * 0.9;
			}else if (season.equals("Winter")) {
				price = km * 1.05;
			}	
		}else if ((5000 < km) && (km <= 10000)) {
			if (season.equals("Spring") || season.equals("Autumn")) {
				price = km * 0.95;
			}else if (season.equals("Summer")) {
				price = km * 1.1;
			}else if (season.equals("Winter")) {
				price = km * 1.25;
			}
		}else if (10000 < km) {
			price = km * 1.45;
		}
		price *= 4;
		price *= (1 - 0.1);
		
		System.out.printf("%.2f", price);
		scan.close();

	}

}
