package nasted_loops_exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNum = Integer.parseInt(scan.nextLine());
		int secondNum = Integer.parseInt(scan.nextLine());
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = firstNum; i <= secondNum; i++) {
			String num = "" + i;
			for (int j = 0; j < num.length(); j++) {
				int digit = Integer.parseInt("" + num.charAt(j));
				if ((j % 2) == 0) {
					sumEven += digit;
				} else {
					sumOdd += digit;
				}
			}
			if (sumEven == sumOdd) {
				System.out.print(i +" ");
			}
			sumEven = 0;
			sumOdd = 0;
		}
		scan.close();

	}

}
