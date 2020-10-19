package while_loop_lab;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int min = Integer.MAX_VALUE;
		
		while (!text.equals("Stop")) {
			int number = Integer.parseInt(text);
			if (number < min) {
				min = number;
			}
			text = scan.nextLine();
		}
		System.out.println(min);
		scan.close();

	}

}
