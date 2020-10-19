package conditional_statments_advanced_lab;

import java.util.Scanner;

public class SmallShop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product = scan.nextLine();
		String town = scan.nextLine();
		double num = Double.parseDouble(scan.nextLine());
		double price = 0;
		
		if (town.equals("Sofia")) {
			switch (product) {
			case "coffee":
				price = num * 0.5;
				System.out.println(price);
				break;
			case "water":
				price = num * 0.8;
				System.out.println(price);
				break;
			case "beer":
				price = num * 1.2;
				System.out.println(price);
				break;
			case "sweets":
				price = num * 1.45;
				System.out.println(price);
				break;
			case "peanuts":
				price = num * 1.6;
				System.out.println(price);
				break;
			}
		}else if (town.equals("Plovdiv")) {
			switch (product) {
			case "coffee":
				price = num * 0.4;
				System.out.println(price);
				break;
			case "water":
				price = num * 0.7;
				System.out.println(price);
				break;
			case "beer":
				price = num * 1.15;
				System.out.println(price);
				break;
			case "sweets":
				price = num * 1.3;
				System.out.println(price);
				break;
			case "peanuts":
				price = num * 1.5;
				System.out.println(price);
				break;
			}
		}else if (town.equals("Varna")) {
			switch (product) {
			case "coffee":
				price = num * 0.45;
				System.out.println(price);
				break;
			case "water":
				price = num * 0.7;
				System.out.println(price);
				break;
			case "beer":
				price = num * 1.1;
				System.out.println(price);
				break;
			case "sweets":
				price = num * 1.35;
				System.out.println(price);
				break;
			case "peanuts":
				price = num * 1.55;
				System.out.println(price);
				break;
			}
		}
		scan.close();

	}

}
