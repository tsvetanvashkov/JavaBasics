package nested_loops_lab;

import java.util.Scanner;

public class Traveling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String destination = scan.nextLine();
			if (destination.equals("End")) {
				break;
			}
			int sum = 0;
			double price = Double.parseDouble(scan.nextLine());
			while (sum < price) {
				double money = Double.parseDouble(scan.nextLine());
				sum += money;
			}
			System.out.println("Going to " + destination + "!");
			
		}
		scan.close();

	}

}
