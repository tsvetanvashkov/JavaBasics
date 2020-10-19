package for_loop_lab;

import java.util.Scanner;

public class NumbersFrom1ToNWithStep3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		for (int i = 1; i <= num; i += 3) {
			System.out.println(i);
		}
		scan.close();

	}

}
