package for_loop_lab;

import java.util.Scanner;

public class CleverLily {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yearsOld = Integer.parseInt(scan.nextLine());
		double priceWM = Double.parseDouble(scan.nextLine());
		int priceForToy = Integer.parseInt(scan.nextLine());
		int even = 0;
		int odd = 0;
		double money = 0;
		
		for (int i = 1, mon = 0; i <= yearsOld; i++) {
			if ((i % 2) != 0) {
				odd++;
			} else {
				even++;
				mon += 10;
				money += mon;
			}
			
		}
		
		money -= even;
		money += (priceForToy * odd);
		
		if (priceWM <= money) {
			System.out.printf("Yes! %.2f", (money - priceWM));
		} else {
			System.out.printf("No! %.2f", (priceWM - money));
		}
		scan.close();
		

	}

}
