package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class Flowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numChrisanthemum = Integer.parseInt(scan.nextLine());
		int numRouse = Integer.parseInt(scan.nextLine());
		int numTulip = Integer.parseInt(scan.nextLine());
		String season = scan.nextLine();
		String holiday = scan.nextLine();
		double priceChrisanthemum = 0;
		double priceRose = 0;
		double priceTulip = 0;
		double price = 0;
		int num = numChrisanthemum + numRouse + numTulip;
		
		if ((season.equals("Spring")) || (season.equals("Summer"))) {
			priceChrisanthemum = numChrisanthemum * 2;
			priceRose = numRouse * 4.1;
			priceTulip = numTulip * 2.5;
		}else if ((season.equals("Autumn")) || (season.equals("Winter"))) {
			priceChrisanthemum = numChrisanthemum * 3.75;
			priceRose = numRouse * 4.5;
			priceTulip = numTulip * 4.15;
		}
		
		price = priceChrisanthemum + priceRose + priceTulip;
		
		if (holiday.equals("Y")) {
			price *= (1 + 0.15);
		}

		if ((season.equals("Spring")) && (numTulip > 7)) {
			price *= (1 - 0.05);
		}else if ((season.equals("Winter")) && (numRouse >= 10)) {
			price *= (1 - 0.1);
		}
		
		if (num > 20) {
			price *= (1 - 0.2);
		}
		
		price += 2;
		
		System.out.printf("%.2f", price);
		scan.close();

	}

}
