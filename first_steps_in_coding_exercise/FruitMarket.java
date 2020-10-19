package first_steps_in_coding_exercise;

import java.util.Scanner;

public class FruitMarket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double priceBerries = Double.parseDouble(scan.nextLine());
		double banana = Double.parseDouble(scan.nextLine());
		double orange = Double.parseDouble(scan.nextLine());
		double raspberrie = Double.parseDouble(scan.nextLine());
		double berrie = Double.parseDouble(scan.nextLine());
		double priceRaspberrie = priceBerries * 0.5;
		double priceOrange = priceRaspberrie - (priceRaspberrie * 0.4);
		double priceBanana = priceRaspberrie - (priceRaspberrie * 0.8);
		double sum = (priceBerries*berrie)+(priceRaspberrie*raspberrie)+(priceOrange*orange)+(priceBanana*banana);
		System.out.printf("%.2f", sum);
		scan.close();

	}

}
