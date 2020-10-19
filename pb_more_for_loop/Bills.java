package pb_more_for_loop;

import java.util.Scanner;

public class Bills {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int monts = Integer.parseInt(scan.nextLine());
		int water = 20;
		int internet = 15;
		double other = 0;
		double totalPower = 0;
		double totalWater = 0;
		double totalInternet = 0;
		double totalOther = 0;
		double average = 0;
		
		
		for (int i = 1; i <= monts; i++) {
			double power = Double.parseDouble(scan.nextLine());
			totalPower = totalPower + power;
			totalWater = totalWater + water;
			totalInternet = totalInternet +internet;
			other = (power + water + internet)*(1 + 0.2);
			totalOther = totalOther + other;
			
		}
		
		average = (totalPower + totalWater + totalInternet + totalOther)/monts;
		
		System.out.printf("Electricity: %.2f lv\n", totalPower);
		System.out.printf("Water: %.2f lv\n", totalWater);
		System.out.printf("Internet: %.2f lv\n", totalInternet);
		System.out.printf("Other: %.2f lv\n", totalOther);
		System.out.printf("Average: %.2f lv", average);

		scan.close();

	}

}
