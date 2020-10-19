package first_steps_in_coding_lab;

import java.util.Scanner;

public class GreetingByName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.printf("Hello, %s!", name);
		scan.close();

	}

}
