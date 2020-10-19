package pb_more_nested_conditional_statements_advanced;

import java.util.Scanner;

public class BikeRace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numJunior = Integer.parseInt(scan.nextLine());
		int numSenior = Integer.parseInt(scan.nextLine());
		String track = scan.nextLine();
		double price = 0;
		
		if (track.equals("trail")) {
			price = (numJunior * 5.5) + (numSenior * 7);
		}else if (track.equals("cross-country")) {
			price = (numJunior * 8) + (numSenior * 9.5);
			if ((numJunior + numSenior) >= 50) {
				price *= (1 - 0.25); 
			}
		}else if (track.equals("downhill")) {
			price = (numJunior * 12.25) + (numSenior * 13.75);
		}else if (track.equals("road")) {
			price = (numJunior * 20) + (numSenior * 21.5);
		}
		
		price *= (1 - 0.05);
		
		System.out.printf("%.2f", price);
		scan.close();

	}

}
