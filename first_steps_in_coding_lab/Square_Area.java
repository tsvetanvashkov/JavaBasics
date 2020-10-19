package first_steps_in_coding_lab;

import java.util.Scanner;

public class Square_Area {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int area = a*a;
		System.out.println(area);
		scan.close();

	}

}
