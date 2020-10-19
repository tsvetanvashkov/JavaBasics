package conditional_statments_advanced_lab;

import java.util.Scanner;

public class SkiTrip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		String room = scan.nextLine();
		String opinion = scan.nextLine();
		double price = 0;
		days--;
		
		if (room.equals("room for one person")) {
			price = days * 18;
			
		}else if (room.equals("apartment")) {
			if (days < 10) {
				price = (days * 25)*(1 - 0.3);
			}else if ((10 <= days) && (days <= 15)) {
				price = (days * 25)*(1 - 0.35);
			}else if (15 < days) {
				price = (days * 25)*(1 - 0.5);
			}

		}else if (room.equals("president apartment")) {
			if (days < 10) {
				price = (days * 35)*(1 - 0.1);
			}else if ((10 <= days) && (days <= 15)) {
				price = (days * 35)*(1 - 0.15);
			}else if (15 < days) {
				price = (days * 35)*(1 - 0.2);
			}

		}
		
		if (opinion.equals("positive")) {
			price *= (1 + 0.25);
		}else if (opinion.equals("negative")) {
			price *= (1 - 0.1);
		}
		
		System.out.printf("%.2f", price);
		scan.close();

	}

}
