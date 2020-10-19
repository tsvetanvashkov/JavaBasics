package conditional_statements_lab;

import java.util.Scanner;

public class ToyShop {

	public static void main(String[] args) {
		double puzzel = 2.6;
		int doll = 3;
		double bear = 4.1;
		double minion = 8.2;
		int truck = 2;
		Scanner scan = new Scanner(System.in);
		double price = Double.parseDouble(scan.nextLine());
		int numPuzzel = Integer.parseInt(scan.nextLine());
		int numDoll = Integer.parseInt(scan.nextLine());
		int numBear = Integer.parseInt(scan.nextLine());
		int numMinion = Integer.parseInt(scan.nextLine());
		int numTruck = Integer.parseInt(scan.nextLine());
		
		int allToys = numPuzzel + numDoll + numBear + numMinion + numTruck;
		double profit = (puzzel*numPuzzel) + (doll*numDoll) + (bear*numBear) + (minion*numMinion) + (truck*numTruck);
		
		if (allToys >= 50 ) {
			profit *= (1 - 0.25);
		}
		profit *= (1 - 0.1);
		
		if (profit >= price) {
			System.out.printf("Yes! %.2f lv left.", (profit - price));
		} else {
			System.out.printf("Not enough money! %.2f lv needed.", (price - profit));
		}
		scan.close();
		
	}

}
