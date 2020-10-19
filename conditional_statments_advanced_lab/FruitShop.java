package conditional_statments_advanced_lab;

import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fruit = scan.nextLine();
		String day = scan.nextLine();
		double num = Double.parseDouble(scan.nextLine());
		double price = 0;
		
			switch (day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				switch (fruit) {
				case "banana":
					price = num * 2.5;
					System.out.printf("%.2f", price);
					break;
				case "apple":
					price = num * 1.2;
					System.out.printf("%.2f", price);
					break;
				case "orange":
					price = num * 0.85;
					System.out.printf("%.2f", price);
					break;
				case "grapefruit":
					price = num * 1.45;
					System.out.printf("%.2f", price);
					break;
				case "kiwi":
					price = num * 2.7;
					System.out.printf("%.2f", price);
					break;
				case "pineapple":
					price = num * 5.5;
					System.out.printf("%.2f", price);
					break;
				case "grapes":
					price = num * 3.85;
					System.out.printf("%.2f", price);
					break;
				default:
					System.out.println("error");
					break;
				}
				
				break;
			case "Saturday":
			case "Sunday":
				switch (fruit) {
				case "banana":
					price = num * 2.7;
					System.out.printf("%.2f", price);
					break;
				case "apple":
					price = num * 1.25;
					System.out.printf("%.2f", price);
					break;
				case "orange":
					price = num * 0.9;
					System.out.printf("%.2f", price);
					break;
				case "grapefruit":
					price = num * 1.6;
					System.out.printf("%.2f", price);
					break;
				case "kiwi":
					price = num * 3;
					System.out.printf("%.2f", price);
					break;
				case "pineapple":
					price = num * 5.6;
					System.out.printf("%.2f", price);
					break;
				case "grapes":
					price = num * 4.2;
					System.out.printf("%.2f", price);
					break;
				default:
					System.out.println("error");
					break;
				}
				
				break;
			default:
				System.out.println("error");
				break;
			}

		scan.close();

	}

}
