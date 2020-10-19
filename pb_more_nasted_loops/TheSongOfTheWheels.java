package pb_more_nasted_loops;

import java.util.Scanner;

public class TheSongOfTheWheels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		int count = 0;
		String pass = "";
		boolean passF = false;
		
		for (int i = 1; i < 10; i++) {
			for (int j = (i + 1); j < 10; j++) {
				for (int j2 = 1; j2 < 10; j2++) {
					for (int k = 1; k < j2; k++) {
						sum = (j * i) + (j2 * k);
						if (sum == num) {
							System.out.printf("%d%d%d%d ", i, j, j2, k);
							count++;
						}
						if ((count) == 4 && (passF == false)) {
							passF = true;
							pass ="" + i + j + j2 + k;
							
						}
						
					}
				}
			}
		}
		
		if (passF) {
			System.out.println("\nPassword: " + pass);
		} else {
			System.out.println("\nNo!");
		}
		scan.close();

	}

}
