package pb_more_simple_operations;

import java.util.Scanner;

public class WeatherForecast2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double deg = Double.parseDouble(scan.nextLine());
		if (26<=deg && deg<=35) {
			System.out.println("Hot");
		}else if (20.1<=deg && deg<=25.9) {
			System.out.println("Warm");
		}else if (15<=deg && deg<=20) {
			System.out.println("Mild");
		}else if (12<=deg && deg<=14.9) {
			System.out.println("Cool");
		}else if (5<=deg && deg<=11.9) {
			System.out.println("Cold");
		} else {
			System.out.println("unknown");
		}
		scan.close();

	}

}
