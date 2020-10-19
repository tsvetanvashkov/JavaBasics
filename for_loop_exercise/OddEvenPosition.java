package for_loop_exercise;

import java.util.Scanner;

public class OddEvenPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		double maxEven = Integer.MIN_VALUE;
		double maxOdd = Integer.MIN_VALUE;
		double minEven = Double.MAX_VALUE;
		double minOdd = Double.MAX_VALUE;
		double sumEven  = 0;
		double sumOdd = 0;
		
		for (int i = 1; i <= count; i++) {
			double num = Double.parseDouble(scan.nextLine());
			if ((i % 2) == 0) {
				sumEven += num;
				if (num > maxEven) {
					maxEven = num;
				}
				if (num < minEven) {
					minEven = num;
				}
			}else {
				sumOdd += num;
				if (num > maxOdd) {
					maxOdd = num; 
				}
				if (num < minOdd) {
					minOdd = num;
				}
			}
		}
		
		System.out.printf("OddSum=%.2f,\n", sumOdd);
		if (minOdd == Double.MAX_VALUE) {
			System.out.println("OddMin=No,");
		}else {
			System.out.printf("OddMin=%.2f,\n", minOdd);
		}
		if (maxOdd == Integer.MIN_VALUE) {
			System.out.println("OddMax=No,");
		}else {
			System.out.printf("OddMax=%.2f,\n", maxOdd);
		}
		System.out.printf("EvenSum=%.2f,\n", sumEven);
		if (minEven == Double.MAX_VALUE) {
			System.out.println("EvenMin=No,");
		}else {
			System.out.printf("EvenMin=%.2f,\n", minEven);
		}
		if (maxEven == Integer.MIN_VALUE) {
			System.out.println("EvenMax=No");
		}else {
			System.out.printf("EvenMax=%.2f\n", maxEven);
		}
		scan.close();

	}

}
