package conditional_statements_exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double secWR = Double.parseDouble(scan.nextLine());
		double meter = Double.parseDouble(scan.nextLine());
		double secM = Double.parseDouble(scan.nextLine());

		double secLost = (Math.floor(meter / 15))* 12.5;
		double secIvan = (meter * secM) + secLost;
		
		if (secIvan < secWR) {
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", secIvan);
		} else {
			System.out.printf("No, he failed! He was %.2f seconds slower.", (secIvan - secWR));
		}
		scan.close();

	}

}
