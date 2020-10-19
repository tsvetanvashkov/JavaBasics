package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class MatchTickets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double budget = Double.parseDouble(scan.nextLine());
		String ticket = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		double trip = 0;
		double priceTicket = 0;
		double price = 0;
		
		if ((1 <= num) && (num <= 4)) {
			trip = budget * 0.75;
		}else if ((5 <= num) && (num <= 9)) {
			trip = budget * 0.6;
		}else if ((10 <= num) && (num <= 24)) {
			trip = budget * 0.5;
		}else if ((25 <= num) && (num <= 49)) {
			trip = budget * 0.4;
		}else if (50 <= num) {
			trip = budget * 0.25;
		}
		
		if (ticket.equals("VIP")) {
			priceTicket = num * 499.99;
		}else if (ticket.equals("Normal")) {
			priceTicket = num * 249.99;
		}
		
		price = priceTicket + trip;
		
		if (price <= budget) {
			System.out.printf("Yes! You have %.2f leva left.", (budget - price));
		}else if (budget < price) {
			System.out.printf("Not enough money! You need %.2f leva.", (price - budget));
		}
		scan.close();

	}

}
