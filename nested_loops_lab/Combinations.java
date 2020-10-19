package nested_loops_lab;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int count = 0;
		
		for (int x1 = 0; x1 <= number; x1++) {
			for (int x2 = 0; x2 <= number; x2++) {
				for (int x3 = 0; x3 <= number; x3++) {
					if ((x1+x2+x3) == number) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
		scan.close();
	}

}
