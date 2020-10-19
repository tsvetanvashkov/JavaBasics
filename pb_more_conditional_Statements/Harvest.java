package pb_more_conditional_Statements;

import java.util.Scanner;

public class Harvest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int area = Integer.parseInt(scan.nextLine());
		double grape = Double.parseDouble(scan.nextLine());
		int wantedWine = Integer.parseInt(scan.nextLine());
		int workers = Integer.parseInt(scan.nextLine());
		
		double wine = (grape*(area*0.4))/2.5;
		
		if (wine < wantedWine) {
			System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wantedWine-wine));
		} else {
			double wineLeft= Math.ceil(wine-wantedWine);
			System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.", Math.floor(wine), wineLeft, Math.ceil(wineLeft/workers));
		}
		scan.close();

	}

}
