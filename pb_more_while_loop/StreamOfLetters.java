package pb_more_while_loop;

import java.util.Scanner;

public class StreamOfLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String word = "";
		boolean countC = true;
		boolean countN = true;
		boolean countO = true;
		int num = 0;
		
		while (!input.equals("End")) {
			char letter = input.charAt(0);
			num = letter;
			if ((num >= 65) && (num <= 90) || (num >= 97) && (num <= 122)) {
				if (num == 99 && countC) {
					countC = false;
					if ((countC == false) && (countN == false) && (countO == false)) {
						System.out.print(word + " ");
						countC = countN = countO = true;
						word = "";
					}
					input = scan.nextLine();
					continue;
				}else if (num == 110 && countN) {
					countN = false;
					if ((countC == false) && (countN == false) && (countO == false)) {
						System.out.print(word + " ");
						countC = countN = countO = true;
						word = "";
					}
					input = scan.nextLine();
					continue;
				}else if (num == 111 && countO) {
					countO = false;
					if ((countC == false) && (countN == false) && (countO == false)) {
						System.out.print(word + " ");
						countC = countN = countO = true;
						word = "";
					}
					input = scan.nextLine();
					continue;
				}
				word = word + letter;
				
			}
			input = scan.nextLine();
		}
		scan.close();

	}

}
//122  65  99  111 110