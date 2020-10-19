package pb_more_simple_operations;

import java.util.Scanner;

public class VegetableMarket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double priceVegetable = Double.parseDouble(scan.nextLine());
		double priceFruit = Double.parseDouble(scan.nextLine());
		int weightVegetable = Integer.parseInt(scan.nextLine());
		int weightFruit = Integer.parseInt(scan.nextLine());
		double euro = ((priceVegetable * weightVegetable) + (priceFruit * weightFruit))/1.94;
		System.out.printf("%.2f", euro);
		scan.close();

	}

}
