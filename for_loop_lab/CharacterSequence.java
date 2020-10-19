package for_loop_lab;

import java.util.Scanner;

public class CharacterSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			System.out.printf("%c\n", text.charAt(i));
		}
		scan.close();

	}

}
