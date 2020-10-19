package pb_more_simple_operations;

import java.util.Scanner;

public class WeatherForecast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String sunny = "sunny";
		if(text.contentEquals(sunny)) {
			System.out.println("It's warm outside!");
		}else {
			System.out.println("It's cold outside!");
		}
		scan.close();

	}

}
