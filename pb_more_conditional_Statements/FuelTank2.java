package pb_more_conditional_Statements;

import java.util.Scanner;

public class FuelTank2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fuel = scan.nextLine();
		double liters = Double.parseDouble(scan.nextLine());
		String card = scan.nextLine();
		double gasoline = 2.22;
		double diesel = 2.33;
		double gas = 0.93;
		double disGasoline = 0.18;
		double disDiesel = 0.12;
		double disGas = 0.08;
		double price = 0;
		
		if (fuel.equals("Gasoline")) {
			if(card.equals("Yes")) {
				gasoline -= disGasoline;
			}
			price = liters * gasoline;
		}else if (fuel.equals("Diesel")) {
			if(card.equals("Yes")) {
				diesel -= disDiesel;
			}
			price = liters * diesel;
		}else if (fuel.equals("Gas")) {
			if(card.equals("Yes")) {
				gas -= disGas;
			}
			price = liters * gas;
		}
		
		if ((20 < liters) && (liters <= 25) ) {
			price *= (1 - 0.08);
		}else if (liters > 25) {
			price *= (1 - 0.1);
		}
		System.out.printf("%.2f lv.", price);
		scan.close();

	}

}
