package pb_more_conditional_Statements;

import java.util.Scanner;

public class Pets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int food = Integer.parseInt(scan.nextLine());
		double dogFood = Double.parseDouble(scan.nextLine());
		double catFood = Double.parseDouble(scan.nextLine());
		double turtleFood = Double.parseDouble(scan.nextLine());
		
		double foodNeeded = (dogFood * days)+(catFood * days)+((turtleFood*0.001) * days);
		
		if (foodNeeded <= food) {
			System.out.printf("%.0f kilos of food left.", Math.floor(food-foodNeeded));
		} else {
			System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded-food));
		}
		scan.close();

	}

}
