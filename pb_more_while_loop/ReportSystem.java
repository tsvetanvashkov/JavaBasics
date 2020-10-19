package pb_more_while_loop;

import java.util.Scanner;

public class ReportSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int moneyNeed = Integer.parseInt(scan.nextLine());
		int money = 0;
		int count = 0;
		int countCash = 0;
		int countCard = 0;
		double sumCash = 0;
		double sumCard = 0;
		int sumMoney = 0;
		
		while (sumMoney < moneyNeed) {
			String input = scan.nextLine();
			if (input.equals("End")) {
				System.out.println("Failed to collect required money for charity.");
				scan.close();
				return;
			}
			money = Integer.parseInt(input);
			count++;
			if ((count % 2) != 0) {
				if (money > 100) {
					System.out.println("Error in transaction!");
				}else {
					System.out.println("Product sold!");
					sumCash += money;
					sumMoney += money;
					countCash++;
				}
			}else {
				if (money < 10) {
					System.out.println("Error in transaction!");
				}else {
					System.out.println("Product sold!");
					sumCard += money;
					sumMoney += money;
					countCard++;
				}
			}
		}
		
		System.out.printf("Average CS: %.2f\n" + "Average CC: %.2f", (sumCash/countCash), (sumCard/countCard));
		
		scan.close();

	}

}
