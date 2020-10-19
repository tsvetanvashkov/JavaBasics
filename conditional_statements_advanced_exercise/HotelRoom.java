package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class HotelRoom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		double priceStudio = 0;
		double priceApartment = 0;
		
		if ((month.equals("May")) || (month.equals("October"))) {
			priceStudio = 50 * num;
			priceApartment = 65* num;
			if ((7 < num) && (num <= 14)) {
				priceStudio *= (1 - 0.05);
			}else if (14 < num) {
				priceStudio *= (1 - 0.3);
				priceApartment *= (1 - 0.1);
			}
		}else if ((month.equals("June")) || (month.equals("September"))) {
			priceStudio = 75.2 * num;
			priceApartment = 68.7 * num;
			if (14 < num) {
				priceStudio *= (1 - 0.2);
				priceApartment *= (1 - 0.1);
			}
		}else if ((month.equals("July")) || (month.equals("August"))) {
			priceStudio = 76 * num;
			priceApartment = 77 * num;
			if (14 < num) {
				priceApartment *= (1 - 0.1);
			}
		}
		
		System.out.printf("Apartment: %.2f lv.\n", priceApartment);
		System.out.printf("Studio: %.2f lv.", priceStudio);
		scan.close();

	}

}
