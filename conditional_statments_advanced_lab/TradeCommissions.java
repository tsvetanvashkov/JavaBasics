package conditional_statments_advanced_lab;

import java.util.Scanner;

public class TradeCommissions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String town = scan.nextLine();
		double sale= Double.parseDouble(scan.nextLine());
		double price = 0;
		
		if (town.equals("Sofia")) {
			if ((0 <= sale) && (sale <= 500)) {
				price = sale * 0.05;
				System.out.printf("%.2f", price);
			}else if ((500 < sale) && (sale <= 1000)) {
				price = sale * 0.07;
				System.out.printf("%.2f", price);
			}else if ((1000 < sale) && (sale <= 10000)) {
				price = sale * 0.08;
				System.out.printf("%.2f", price);
			}else if (10000 < sale) {
				price = sale * 0.12;
				System.out.printf("%.2f", price);
			}else {
				System.out.println("error");
			}
			
		}else if (town.equals("Varna")) {
			if ((0 <= sale) && (sale <= 500)) {
				price = sale * 0.045;
				System.out.printf("%.2f", price);
			}else if ((500 < sale) && (sale <= 1000)) {
				price = sale * 0.075;
				System.out.printf("%.2f", price);
			}else if ((1000 < sale) && (sale <= 10000)) {
				price = sale * 0.1;
				System.out.printf("%.2f", price);
			}else if (10000 < sale) {
				price = sale * 0.13;
				System.out.printf("%.2f", price);
			}else {
				System.out.println("error");
			}

		}else if (town.equals("Plovdiv")) {
			if ((0 <= sale) && (sale <= 500)) {
				price = sale * 0.055;
				System.out.printf("%.2f", price);
			}else if ((500 < sale) && (sale <= 1000)) {
				price = sale * 0.08;
				System.out.printf("%.2f", price);
			}else if ((1000 < sale) && (sale <= 10000)) {
				price = sale * 0.12;
				System.out.printf("%.2f", price);
			}else if (10000 < sale) {
				price = sale * 0.145;
				System.out.printf("%.2f", price);
			}else {
				System.out.println("error");
			}

		}else {
			System.out.println("error");
		}
		scan.close();

	}

}
