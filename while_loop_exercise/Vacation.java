package while_loop_exercise;

import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double moneyVacation = Double.parseDouble(scan.nextLine());
		double moneyBalance = Double.parseDouble(scan.nextLine());
		boolean fail = false;
		int days = 0;
		int daySpend = 0;
		
		while (moneyVacation > moneyBalance) {
			String spendSave = scan.nextLine();
			double money = Double.parseDouble(scan.nextLine());
			if (spendSave.equals("spend")) {
				moneyBalance -= money;
				daySpend++;
			}else if (spendSave.equals("save")) {
				moneyBalance += money;
				daySpend = 0;
			}
			days++;
			if (moneyBalance < 0) {
				moneyBalance = 0;
			}
			if (daySpend >= 5) {
				fail = true;
				break;
			}
			
			
		}
		if (fail) {
			System.out.printf("You can't save the money.\n%d", days);
		} else {
			System.out.printf("You saved the money for %d days.", days);
		}
		scan.close();

	}

}
