package pb_more_for_loop;

import java.util.Scanner;

public class BackToThePast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double money = Double.parseDouble(scan.nextLine());
		int year = Integer.parseInt(scan.nextLine());
		int yearsOld = 18;
		
		for (int i = 1800; i <= year; i++, yearsOld++) {
			if ((i % 2 ) == 0) {
				money = money - 12000;
			}else {
				money = money - (12000 + (50 * yearsOld));
			}
		}
		
		if (money >= 0) {
			System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
		} else {
			System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
		}
		scan.close();

	}

}
