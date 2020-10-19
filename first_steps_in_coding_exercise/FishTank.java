package first_steps_in_coding_exercise;

import java.util.Scanner;

public class FishTank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lenth = Integer.parseInt(scan.nextLine());
		int width = Integer.parseInt(scan.nextLine());
		int hight = Integer.parseInt(scan.nextLine());
		double percent = Double.parseDouble(scan.nextLine());
		double volume = (lenth*width*hight)*0.001;
		double liters = volume*(1- (percent*0.01));
		System.out.printf("%.2f", liters);
		scan.close();

	}

}
