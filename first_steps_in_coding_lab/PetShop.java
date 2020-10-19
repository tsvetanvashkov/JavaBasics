package first_steps_in_coding_lab;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dogNumber = scan.nextInt();
		int petNumber = scan.nextInt();
		double sum = (dogNumber * 2.5) + (petNumber * 4);
		System.out.printf("%.1f lv.", sum);
		scan.close();

	}

}
