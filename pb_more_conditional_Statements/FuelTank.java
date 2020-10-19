package pb_more_conditional_Statements;

import java.util.Scanner;

public class FuelTank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fuel = scan.nextLine();
		double liters = Double.parseDouble(scan.nextLine());
		
		if (fuel.equals("Diesel")) {
			if(liters < 25) {
				System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
			}else {
				System.out.printf("You have enough %s.", fuel.toLowerCase());
			}
			
		}else if (fuel.equals("Gasoline")) {
			if(liters < 25) {
				System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
			}else {
				System.out.printf("You have enough %s.", fuel.toLowerCase());
			}
			
		}else if (fuel.equals("Gas")) {
			if(liters < 25) {
				System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
			}else {
				System.out.printf("You have enough %s.", fuel.toLowerCase());
			}
			
		}else {
			System.out.println("Invalid fuel!");
		}
		scan.close();

	}

}
