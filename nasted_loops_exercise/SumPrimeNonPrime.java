package nasted_loops_exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int sumPrime = 0;
		int sumNotPrime = 0;
		boolean isPrime = true;
		
		while (!input.equals("stop")) {
			int num = Integer.parseInt(input);
			if (num < 0) {
				System.out.println("Number is negative.");
			}else if ((num == 0) || (num == 1)) {
				sumNotPrime += num;
			}else {
				for (int i = 2; i <= (num / 2); i++) {
					if ((num % i) == 0) {
						isPrime = false;
					}
				}
				if (isPrime) {
					sumPrime += num;
				}else {
					sumNotPrime += num;
				}
			}
			
			isPrime = true;
			input = scan.nextLine();
		}
		
		System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
		System.out.printf("Sum of all non prime numbers is: %d\n", sumNotPrime);
		scan.close();

	}

}
