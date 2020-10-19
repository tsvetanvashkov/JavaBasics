package nested_loops_lab;

import java.util.Scanner;

public class Building {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int floors = Integer.parseInt(scan.nextLine());
		int rooms = Integer.parseInt(scan.nextLine());
		String room = "";
		
		for (int i = floors; i > 0; i--) {
			if (i == floors) {
				room = "L";
			}else if ((i % 2) != 0) {
				room = "A";
			}else if ((i % 2) == 0) {
				room = "O";
			}
			for (int j = 0; j < rooms; j++) {
				System.out.printf("%s%d%d ", room, i, j);
			}
			System.out.println();
		}
		scan.close();

	}

}
