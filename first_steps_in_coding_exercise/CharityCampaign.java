package first_steps_in_coding_exercise;

import java.util.Scanner;

public class CharityCampaign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int confectioner = Integer.parseInt(scan.nextLine());
		int cakes = Integer.parseInt(scan.nextLine());
		int waffles = Integer.parseInt(scan.nextLine());
		int pancake = Integer.parseInt(scan.nextLine());
		double sum = (((cakes*45)+(waffles*5.8)+(pancake*3.2))*confectioner)*days;
		sum -= sum/8;
		System.out.printf("%.2f", sum);
		scan.close();
		
	}

}
