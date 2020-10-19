package pb_more_conditional_Statements;

import java.util.Scanner;

public class FlowerShop {

	public static void main(String[] args) {
		double magnolii = 3.25;
		double zumbul = 4;
		double rose = 3.50;
		double kaktus = 8;
		Scanner scan = new Scanner(System.in);
		int priceMagnolii = Integer.parseInt(scan.nextLine());
		int priceZumbul = Integer.parseInt(scan.nextLine());
		int priceRose = Integer.parseInt(scan.nextLine());
		int priceKaktus = Integer.parseInt(scan.nextLine());
		double gift = Double.parseDouble(scan.nextLine());
		
		double money = (1 - 0.05)*((magnolii * priceMagnolii)+(zumbul * priceZumbul)+(rose * priceRose)+(kaktus * priceKaktus));
		
		if (money >= gift) {
			System.out.printf("She is left with %.0f leva.", Math.floor(money-gift));
		} else {
			System.out.printf("She will have to borrow %.0f leva.", Math.ceil(gift-money));
		}
		scan.close();

	}

}
