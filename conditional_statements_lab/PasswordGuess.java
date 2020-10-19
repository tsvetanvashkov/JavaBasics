package conditional_statements_lab;

import java.util.Scanner;

public class PasswordGuess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String pass = "s3cr3t!P@ssw0rd";
		
		if (text.equals(pass)) {
			System.out.println("Welcome");
		} else {
			System.out.println("Wrong password!");
		}
		scan.close();

	}

}
