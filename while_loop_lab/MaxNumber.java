package while_loop_lab;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int max = Integer.MIN_VALUE;
		
		while (!text.equals("Stop")) {
			int number = Integer.parseInt(text);
			if (number > max) {
				max = number;
			}
			text = scan.nextLine();
		}
		System.out.println(max);
		scan.close();

	}

}
