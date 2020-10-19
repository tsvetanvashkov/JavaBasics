package first_steps_in_coding_lab;

import java.util.Scanner;

public class YardGreening {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		double price = area * 7.61;
		double discount = price * 0.18;
		price -= discount;
		System.out.printf("The final price: %.2f lv.\nThe discount is: %.2f lv.", price, discount);
		scan.close();

	}

}

