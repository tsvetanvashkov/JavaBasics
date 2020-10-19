package conditional_statements_advanced_exercise;

import java.util.Scanner;

public class NewHouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String flowers = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		int budget =  Integer.parseInt(scan.nextLine());
		double price = 0;
		
		switch (flowers) {
		case "Roses":
			price = num * 5;
			if (num > 80) {
				price *= (1 - 0.1);
			}
			break;
		case "Dahlias":
			price = num * 3.8;
			if (num > 90) {
				price *= (1 - 0.15);
			}
			break;	
		case "Tulips":
			price = num * 2.8;
			if (num > 80) {
				price *= (1 - 0.15);
			}
			break;		
		case "Narcissus":
			price = num * 3;
			if (num < 120) {
				price *= (1 + 0.15);
			}
			break;	
		case "Gladiolus":
			price = num * 2.5;
			if (num < 80) {
				price *= (1 + 0.2);
			}
			break;	
		}
		
		if (price <= budget) {
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, flowers, (budget - price));
		}else {
			System.out.printf("Not enough money, you need %.2f leva more.", (price- budget));
		}
		scan.close();
		

	}

}
