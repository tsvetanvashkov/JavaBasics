package pb_more_nasted_loops;

import java.util.Scanner;

public class LettersCombinations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		char miss = scan.next().charAt(0);
		
		int count = 0;
		int numStart = start;
		int numEnd = end;
		int numMiss = miss;
		
		for (int i = numStart; i <= numEnd; i++) {
			if (i == numMiss) {
				continue;
			}
			for (int j = numStart; j <= numEnd; j++) {
				if (j == numMiss) {
					continue;
				}
				for (int j2 = numStart; j2 <= numEnd; j2++) {
					if (j2 == numMiss) {
						continue;
					}else {
						System.out.printf("%c%c%c ", i,  j, j2);
						count++;
					}
				}
			}
		}
		System.out.println(count);
		scan.close();

	}

}
