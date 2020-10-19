package first_steps_in_coding_exercise;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rent = Integer.parseInt(scan.nextLine());
		double priceCake = rent * 0.2;
		double priceDrinks = priceCake - (priceCake * 0.45);
		double clown = rent / 3;
		double sum = rent + priceCake + priceDrinks +clown;
		System.out.printf("%.1f", sum);
		scan.close();
		

	}

}
