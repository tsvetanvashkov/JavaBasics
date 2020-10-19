package nasted_loops_exercise;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int digit = Integer.parseInt(scan.nextLine());
		int letter = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= digit; i++) {
			for (int j = 1; j <= digit; j++) {
				for (int j2 = 97; j2 < (letter + 97); j2++) {
					for (int k = 97; k < (letter + 97); k++) {
						if (i < j) {
							for (int k2 = (j + 1); k2 <= digit; k2++) {
								System.out.printf("%d%d%c%c%d ",i, j, j2, k, k2);
							}	
						}else {
							for (int k2 = (i + 1); k2 <= digit; k2++) {
								System.out.printf("%d%d%c%c%d ",i, j, j2, k, k2);
							}	
						}
						
					}
				}
			}
		}
		scan.close();

	}

}
