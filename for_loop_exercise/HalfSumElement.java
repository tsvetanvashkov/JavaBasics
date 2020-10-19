package for_loop_exercise;

import java.util.Scanner;

public class HalfSumElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int max = Integer.MIN_VALUE;
		int sum  = 0;
		
		for (int i = 0; i < count; i++) {
			int num = Integer.parseInt(scan.nextLine());
			if (num >= max) {
				max = num;
			}
			sum += num;
		}
		
		sum -= max;
		
		if (sum ==  max) {
			System.out.printf("Yes\nSum = %d", sum);
		} else {
			System.out.printf("No\nDiff = %d", Math.abs(max - sum));
		}
		scan.close();
		
	}

}
