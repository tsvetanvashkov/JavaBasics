package pb_more_simple_operations;

import java.util.Scanner;

public class Fishland {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double priceScumriq = Double.parseDouble(scan.nextLine());
		double priceCaca = Double.parseDouble(scan.nextLine());
		double weightPalamud = Double.parseDouble(scan.nextLine());
		double weightSafrid = Double.parseDouble(scan.nextLine());
		int weightMidi = Integer.parseInt(scan.nextLine());
		
		double pricePalamud = priceScumriq*(1 + 0.6);
		double priceSafrid = priceCaca*(1 + 0.8);
		double priceMidi = 7.5;
		
		double bill = (pricePalamud * weightPalamud)+(priceSafrid * weightSafrid)+(priceMidi * weightMidi);
		System.out.printf("%.2f", bill);
		scan.close();
		
		

	}

}
