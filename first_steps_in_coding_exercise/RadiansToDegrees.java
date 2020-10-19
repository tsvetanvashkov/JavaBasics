package first_steps_in_coding_exercise;

import java.util.Scanner;

public class RadiansToDegrees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double rad = Double.parseDouble(scan.nextLine());
		double deg = rad * 180 / Math.PI;
		System.out.printf("%.0f", deg);
		scan.close();

	}

}
