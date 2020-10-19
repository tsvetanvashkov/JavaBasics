package while_loop_lab;

import java.util.Scanner;

public class Sequence2k1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int sequence = 1;
		
		while (sequence <= number) {
			System.out.println(sequence);
			sequence = (2 * sequence)+ 1;
		}
		scan.close();

	}

}
